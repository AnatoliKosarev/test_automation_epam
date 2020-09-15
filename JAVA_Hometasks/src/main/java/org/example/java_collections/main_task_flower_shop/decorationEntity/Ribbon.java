package org.example.java_collections.main_task_flower_shop.decorationEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.DecorationStock.RIBBON;

public class Ribbon extends Decoration {
    public Ribbon() {
        super(RIBBON.toString(), RIBBON.getDecorationPrice());
    }
}
