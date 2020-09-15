package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.YELLOW_TULIP;

public class YellowTulip extends Flower {
    public YellowTulip() {
        super(YELLOW_TULIP.toString(), YELLOW_TULIP.getPrice(), YELLOW_TULIP.getMaxFreshnessValue(),
                YELLOW_TULIP.getMinFreshnessValue(), YELLOW_TULIP.getMaxStemLength(), YELLOW_TULIP.getMinStemLength());
    }
}
