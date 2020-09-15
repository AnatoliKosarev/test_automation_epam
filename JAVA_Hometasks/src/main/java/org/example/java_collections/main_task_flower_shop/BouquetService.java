package org.example.java_collections.main_task_flower_shop;

import org.example.java_collections.main_task_flower_shop.decorationEntity.Decoration;
import org.example.java_collections.main_task_flower_shop.flowerEntity.Flower;
import org.example.java_collections.main_task_flower_shop.flowerEntity.flowerComparators.FlowerFreshnessComparator;
import org.example.java_collections.main_task_flower_shop.flowerEntity.flowerComparators.FlowerStemLengthComparator;

import java.util.*;

import static org.example.java_collections.main_task_flower_shop.constants.Constants.Currencies;
import static org.example.java_collections.main_task_flower_shop.constants.Constants.LengthMeasure;

public class BouquetService {
    private final List<Flower> bouquet;
    private double price;
    private Map<String, Integer> flowerTypeCount;
    private String decorationUsed;
    private boolean isDecorationAdded = false;

    public BouquetService() {
        bouquet = new ArrayList<>();
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public double getPrice() {
        for (Flower flower : bouquet) {
            price += flower.getFlowerPrice();
        }
        return price;
    }

    public void getBouquetDescription() {
        StringBuilder bouquetDescription = new StringBuilder("Bouquet, containing: ");
        countFlowerTypesInBouquet();
        for (Map.Entry<String, Integer> flowerType : flowerTypeCount.entrySet()) {
            bouquetDescription.append(flowerType.getValue()).append(" ").append(flowerType.getKey());
            if (flowerType.getValue() > 1) {
                bouquetDescription.append("s, ");
            } else {
                bouquetDescription.append(", ");
            }
        }

        if (isDecorationAdded) {
            bouquetDescription.append("wrapped in ").append(decorationUsed).append(", is ready!");
        } else {
            bouquetDescription.append(" is ready!");
        }

        bouquetDescription.append("\nBouquet costs ").append(this.getPrice()).append(" ").
                append(Currencies.CURRENCY_BYN);

        System.out.println(bouquetDescription);
    }

    public void createBouquet(Flower... flowers) {
        bouquet.addAll(Arrays.asList(flowers));
    }

    public void addDecorationToBouquet(Decoration decoration) {
        isDecorationAdded = true;
        decorationUsed = decoration.getDecorationType();
        price += decoration.getDecorationPrice();
    }

    public void countFlowerTypesInBouquet() {
        flowerTypeCount = new HashMap<>();
        for (Flower flower : bouquet) {
            String flowerType = flower.getFlowerType();
            flowerTypeCount.merge(flowerType, 1, Integer::sum);
        }
    }

    public void sortBouquetByFlowerFreshness() {
        bouquet.sort(new FlowerFreshnessComparator());
        System.out.println("\nBouquet is sorted by flower freshness:");
        for (Flower flower : bouquet) {
            System.out.println(flower.getFlowerType() + " freshness value is " + flower.getFreshnessVolume());
        }
    }

    public void sortBouquetByFlowerStemLength() {
        bouquet.sort(new FlowerStemLengthComparator());
    }

    public void selectFlowersWithinStemLengthRange(int minStemLength, int maxStemLength) {
        sortBouquetByFlowerStemLength();
        System.out.println("\nFollowing flower(s) have stem length within the range of " +
                minStemLength + " - " + maxStemLength + " " + LengthMeasure.CENTIMETRE + ":");
        for (Flower flower : bouquet) {
            double flowerStemLength = flower.getStemLength();
            if (flowerStemLength >= minStemLength && flowerStemLength <= maxStemLength) {
                System.out.println(flower.getFlowerType() + " with stem length " + flowerStemLength +
                        " " + LengthMeasure.CENTIMETRE);
            } else if (flowerStemLength > maxStemLength) {
                break;
            }
        }
    }
}
