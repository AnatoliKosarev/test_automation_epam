package org.example.java_fundamentals.optional_task1;

import java.util.Comparator;
import java.util.List;

public class OptionalSubtask2 {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();
        List<Integer> list = listCreator.addValuesToList();

        if (!list.isEmpty()) {
            list.sort(Comparator.comparingInt(o -> o.toString().length()));

            System.out.println("Числа в порядке возрастания значений их длины");
            for (Integer integer : list) {
                System.out.println(integer);
            }

            System.out.println();

            list.sort(Comparator.comparingInt(o -> o.toString().length()).reversed());

            System.out.println("Числа в порядке убывания значений их длины");
            for (Integer integer : list) {
                System.out.println(integer);
            }
        } else System.out.println("Значения не были введены.");
    }
}
