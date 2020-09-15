package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.RED_CARNATION;

public class RedCarnation extends Flower {

    public RedCarnation() {
        super(RED_CARNATION.toString(), RED_CARNATION.getPrice(), RED_CARNATION.getMaxFreshnessValue(),
                RED_CARNATION.getMinFreshnessValue(), RED_CARNATION.getMaxStemLength(), RED_CARNATION.getMinStemLength());
    }
}
