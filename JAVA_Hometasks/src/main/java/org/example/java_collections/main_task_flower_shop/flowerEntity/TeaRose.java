package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.TEA_ROSE;

public class TeaRose extends Flower{
    public TeaRose() {
        super(TEA_ROSE.toString(), TEA_ROSE.getPrice(), TEA_ROSE.getMaxFreshnessValue(),
                TEA_ROSE.getMinFreshnessValue(), TEA_ROSE.getMaxStemLength(), TEA_ROSE.getMinStemLength());
    }
}
