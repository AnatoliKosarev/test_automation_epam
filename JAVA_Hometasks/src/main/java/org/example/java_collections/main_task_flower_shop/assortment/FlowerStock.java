package org.example.java_collections.main_task_flower_shop.assortment;

public enum FlowerStock {
    /**
     * TODO
     * add values for flowers from some file
     */
    RED_TULIP(10.50,45.95, 30.00, 25.00, 20.10),
    YELLOW_TULIP( 10.50,75.95, 71.20, 27.70, 22.30),
    RED_CARNATION(5.25,82.41, 71.00, 17.12, 14.13),
    WHITE_CARNATION( 5.75,87.59, 79.80, 16.35, 14.20),
    RED_ROSE( 15.50, 99.99, 55.00, 45.05, 30.00),
    TEA_ROSE( 16.00,99.93, 67.09, 48.00, 41.08);

    private final double price;
    private final double maxFreshnessValue;
    private final double minFreshnessValue;
    private final double maxStemLength;
    private final double minStemLength;

    FlowerStock(double price, double maxFreshnessValue, double minFreshnessValue,
                double maxStemLength, double minStemLength) {
        this.price = price;
        this.maxFreshnessValue = maxFreshnessValue;
        this.minFreshnessValue = minFreshnessValue;
        this.maxStemLength = maxStemLength;
        this.minStemLength = minStemLength;
    }

    public double getPrice() {
        return price;
    }

    public double getMaxFreshnessValue() {
        return maxFreshnessValue;
    }

    public double getMinFreshnessValue() {
        return minFreshnessValue;
    }

    public double getMaxStemLength() {
        return maxStemLength;
    }

    public double getMinStemLength() {
        return minStemLength;
    }

    @Override
    public String toString() {
        return this.name().replaceAll("_", " ").toLowerCase();
    }
}
