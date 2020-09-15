package org.example.java_fundamentals.optional_task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OptionalSubtask3 {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();
        List<Integer> list = listCreator.addValuesToList();

        double averageLength;
        int counter = 0;
        List<Integer> lessThanAverageList = new ArrayList<>();
        List<Integer> moreThanAverageList = new ArrayList<>();

        if (!list.isEmpty()) {
            for (Integer value : list) {
                counter += value.toString().length();
            }

            averageLength = Math.ceil((double) counter / list.size() * 10) / 10;

            for (Integer value : list) {
                if (value.toString().length() < averageLength) {
                    lessThanAverageList.add(value);
                } else if (value.toString().length() > averageLength) {
                    moreThanAverageList.add(value);
                }
            }

            lessThanAverageList.sort(Comparator.comparingInt(o -> o.toString().length()));
            moreThanAverageList.sort(Comparator.comparingInt(o -> o.toString().length()));


            System.out.println("Средняя длина значений списка = " + averageLength + ".\n");

            if (!lessThanAverageList.isEmpty()) {
                System.out.println("Значения с длиной меньше, чем средняя длина:");

                for (Integer value : lessThanAverageList) {
                    System.out.println("Значение = " + value + " с длиной = " + value.toString().length() + ";");
                }
            } else System.out.println("Отсутствуют значения с длиной меньше, чем средняя длина");

            if (!moreThanAverageList.isEmpty()) {
                System.out.println("\nЗначения с длиной больше, чем средняя длина:");

                for (Integer value : moreThanAverageList) {
                    System.out.println("Значение = " + value + " с длиной = " + value.toString().length() + ";");
                }
            } else System.out.println("Отсутствуют значения с длиной больше, чем средняя длина");
        } else System.out.println("Значения не были введены.");
    }
}
