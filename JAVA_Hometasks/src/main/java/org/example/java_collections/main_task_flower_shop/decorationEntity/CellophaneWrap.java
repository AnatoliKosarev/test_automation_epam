package org.example.java_collections.main_task_flower_shop.decorationEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.DecorationStock.CELLOPHANE_WRAP;

public class CellophaneWrap extends Decoration {
    public CellophaneWrap() {
        super(CELLOPHANE_WRAP.toString(), CELLOPHANE_WRAP.getDecorationPrice());
    }
}
