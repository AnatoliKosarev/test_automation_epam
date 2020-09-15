package org.example.java_collections.main_task_flower_shop.decorationEntity;

public class Decoration {
    private String decorationType;
    private double decorationPrice;

    public Decoration() {}
    public Decoration(String decorationType, double decorationPrice) {
        this.decorationType = decorationType;
        this.decorationPrice = decorationPrice;
    }

    public String getDecorationType() {
        return decorationType;
    }

    public double getDecorationPrice() {
        return decorationPrice;
    }
}
