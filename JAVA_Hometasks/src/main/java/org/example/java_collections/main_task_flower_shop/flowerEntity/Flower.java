package org.example.java_collections.main_task_flower_shop.flowerEntity;

public class Flower {
    private String flowerType;
    private double flowerPrice;
    private double freshnessValue;
    private double stemLengthValue;

    public Flower() {
    }

    public Flower(String flowerType, double flowerPrice, double maxFreshnessValue,
                  double minFreshnessValue, double maxStemLength, double minStemLength) {
        this.flowerType = flowerType;
        this.flowerPrice = flowerPrice;
        this.freshnessValue =
                Math.round((Math.random() * (maxFreshnessValue - minFreshnessValue) +
                        minFreshnessValue) * 100.0) / 100.0;
        this.stemLengthValue =
                Math.round((Math.random() * (maxStemLength - minStemLength) +
                        minStemLength) * 100.0) / 100.0;
    }

    public String getFlowerType() {
        return flowerType;
    }

    public double getFlowerPrice() {
        return flowerPrice;
    }

    public double getFreshnessVolume() {
        return freshnessValue;
    }

    public double getStemLength() {
        return stemLengthValue;
    }
}
