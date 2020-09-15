package org.example.java_collections.main_task_flower_shop.decorationEntity;

import static org.example.java_collections.main_task_flower_shop.assortment.DecorationStock.PAPER_WRAP;

public class PaperWrap extends Decoration{
    public PaperWrap() {
        super(PAPER_WRAP.toString(), PAPER_WRAP.getDecorationPrice());
    }
}
