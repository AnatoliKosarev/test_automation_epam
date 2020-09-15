package org.example.java_collections.main_task_flower_shop.flowerEntity.flowerComparators;

import org.example.java_collections.main_task_flower_shop.flowerEntity.Flower;

import java.util.Comparator;

public class FlowerFreshnessComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return Double.compare(o2.getFreshnessVolume(), o1.getFreshnessVolume());
    }
}
