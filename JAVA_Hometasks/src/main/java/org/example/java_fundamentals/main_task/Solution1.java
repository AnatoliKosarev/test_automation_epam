package org.example.java_fundamentals.main_task;

public class Solution1 {
    public static void main(String[] args) {

        StringBuilder userName = new StringBuilder();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                userName.append(i == 0 ? args[i] : " " + args[i]);
            }

            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Please enter value in CMD");
        }
    }
}
