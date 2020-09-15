package org.example.java_collections.main_task_flower_shop;

import org.example.java_collections.main_task_flower_shop.decorationEntity.CellophaneWrap;
import org.example.java_collections.main_task_flower_shop.flowerEntity.Flower;
import org.example.java_collections.main_task_flower_shop.flowerEntity.RedCarnation;
import org.example.java_collections.main_task_flower_shop.flowerEntity.RedRose;
import org.example.java_collections.main_task_flower_shop.flowerEntity.WhiteCarnation;

import static org.example.java_collections.main_task_flower_shop.constants.Constants.stemLengthRange;

public class FlowerShopRunner {
    public static void main(String[] args) {
        Flower redRose1 = new RedRose();
        Flower redCarnation1 = new RedCarnation();
        Flower whiteCarnation = new WhiteCarnation();
        Flower redCarnation2 = new RedCarnation();
        RedRose redRose2 = new RedRose();

        BouquetService bouquetService = new BouquetService();

        bouquetService.createBouquet(redRose1, redCarnation2, whiteCarnation, redRose2,
                redCarnation1);

        bouquetService.addDecorationToBouquet(new CellophaneWrap());

        bouquetService.getBouquetDescription();

        bouquetService.sortBouquetByFlowerFreshness();

        bouquetService.selectFlowersWithinStemLengthRange(stemLengthRange.MIN_STEM_LENGTH,
                stemLengthRange.MAX_STEM_LENGTH);
    }
}
