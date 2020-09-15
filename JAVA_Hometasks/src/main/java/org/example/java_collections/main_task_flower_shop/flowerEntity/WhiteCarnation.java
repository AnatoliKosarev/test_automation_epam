package org.example.java_collections.main_task_flower_shop.flowerEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.FlowerStock.WHITE_CARNATION;

public class WhiteCarnation extends Flower {
    public WhiteCarnation() {
        super(WHITE_CARNATION.toString(), WHITE_CARNATION.getPrice(), WHITE_CARNATION.getMaxFreshnessValue(),
                WHITE_CARNATION.getMinFreshnessValue(), WHITE_CARNATION.getMaxStemLength(), WHITE_CARNATION.getMinStemLength());
    }
}
