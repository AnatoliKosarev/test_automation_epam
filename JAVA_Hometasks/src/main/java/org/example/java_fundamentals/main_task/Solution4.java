package org.example.java_fundamentals.main_task;

public class Solution4 {
    public static void main(String[] args) {

        int sumResult = 0;
        int multiplicationResult = 1;

        if (args.length > 0) {
            for (String value : args) {
                int inputValue = 0;

                try {
                    inputValue = Integer.parseInt(value);
                } catch (Exception e) {
                    System.out.println("Please enter number in CMD");
                    System.exit(0);
                }

                sumResult += inputValue;
                multiplicationResult *= inputValue;
            }
            System.out.println("Addition result" + sumResult + "Multiplication result" + multiplicationResult);
        } else {
            System.out.println("Please enter number in CMD");
        }
    }
}
