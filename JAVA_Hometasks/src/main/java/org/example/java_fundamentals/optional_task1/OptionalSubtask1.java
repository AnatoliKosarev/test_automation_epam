package org.example.java_fundamentals.optional_task1;

import java.util.List;

public class OptionalSubtask1 {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();
        List<Integer> list = listCreator.addValuesToList();

        if (!list.isEmpty()) {
            Integer shortestValue = list.get(0);
            Integer longestValue = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                Integer listValue = list.get(i);
                if (shortestValue.toString().length() >= listValue.toString().length()) {
                    shortestValue = listValue;
                } else longestValue = listValue;
            }

            System.out.println("Самое короткое число = " + shortestValue + ", с длиной = " + shortestValue.toString().length() + ";");
            System.out.println("Самое длинное число = " + longestValue + ", с длиной = " + longestValue.toString().length() + ".");
        } else System.out.println("Значения не были введены.");
    }
}
