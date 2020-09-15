package org.example.java_collections.optional_tasks.Solution5;

import java.util.*;

public class Solution5 {
    static ArrayList<Integer> list = new ArrayList<Integer>() {
        {
            add(-8);
            add(100);
            add(-12);
            add(55);
            add(0);
            add(-1);
            add(12);
            add(-100);
            add(1500);
        }
    };

    public static void main(String[] args) {

        System.out.println("Original list order");
        printList(list);

        moveListNegativeValuesToTheRight();

        System.out.println("List order after sorting");
        printList(list);
    }

    public static void printList(List<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    public static void moveListNegativeValuesToTheRight() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int value = list.get(i);
                list.add(value);
                list.remove(list.get(i));
            }
        }
    }
}
