package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.RED_TULIP;

public class RedTulip extends Flower {
    public RedTulip() {
        super(RED_TULIP.toString(), RED_TULIP.getPrice(), RED_TULIP.getMaxFreshnessValue(),
                RED_TULIP.getMinFreshnessValue(), RED_TULIP.getMaxStemLength(), RED_TULIP.getMinStemLength());
    }
}
