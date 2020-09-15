package org.example.java_fundamentals.main_task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

        if (args.length > 0) {
            List<String> list = Arrays.asList(args);

            Collections.reverse(list);

            for (String s : list) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("Please enter value in CMD");
        }
    }
}
