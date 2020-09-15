package org.example.java_fundamentals.main_task;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int inputValue = 0;

        try {
            inputValue = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Please enter number in CMD");
        }

        for (int i = 0; i < inputValue; i++) {
            list.add(((int) (Math.random() * 100)));
        }

        for (Integer value : list) {
            System.out.println(value);
        }

        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}
