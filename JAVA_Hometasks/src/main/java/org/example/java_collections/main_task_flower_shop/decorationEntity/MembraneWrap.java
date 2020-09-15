package org.example.java_collections.main_task_flower_shop.decorationEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.DecorationStock.MEMBRANE_WRAP;

public class MembraneWrap extends Decoration {
    public MembraneWrap() {
        super(MEMBRANE_WRAP.toString(), MEMBRANE_WRAP.getDecorationPrice());
    }
}
