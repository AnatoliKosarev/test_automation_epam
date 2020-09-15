package org.example.java_collections.main_task_flower_shop.assortment;

public enum DecorationStock {
    CELLOPHANE_WRAP(3.50),
    PAPER_WRAP(4.00),
    MEMBRANE_WRAP(4.25),
    RIBBON(1.75);

    private final double price;

    DecorationStock(double price) {
        this.price = price;
    }

    public double getDecorationPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name().replaceAll("_", " ").toLowerCase();
    }
}
