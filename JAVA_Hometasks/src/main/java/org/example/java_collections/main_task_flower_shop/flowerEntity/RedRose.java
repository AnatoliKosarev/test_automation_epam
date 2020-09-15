package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.RED_ROSE;

public class RedRose extends Flower{
        public RedRose() {
            super(RED_ROSE.toString(), RED_ROSE.getPrice(), RED_ROSE.getMaxFreshnessValue(),
                    RED_ROSE.getMinFreshnessValue(), RED_ROSE.getMaxStemLength(), RED_ROSE.getMinStemLength());
        }
}
