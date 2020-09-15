package org.example.java_fundamentals.main_task;

import java.time.Month;

public class Solution5 {
    public static void main(String[] args) {
        int inputValue = 0;

        if (args.length > 0) {
            try {
                inputValue = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("Please enter number in CMD");
                System.exit(0);
            }

//          Variant 1 with the use of java.time.Month enum
            if (inputValue > 0 && inputValue <= 12) {
                String monthValue = Month.of(inputValue).toString().toLowerCase();
                String result = monthValue.substring(0,1).toUpperCase() + monthValue.substring(1);
                System.out.println(result);
            } else System.out.println("Please enter integer value between 1-12 in CMD");

//            Variant 2 with the use of switch()
//            switch (inputValue) {
//                case 1:
//                    System.out.println("January");
//                    break;
//                case 2:
//                    System.out.println("February");
//                    break;
//                case 3:
//                    System.out.println("March");
//                    break;
//                case 4:
//                    System.out.println("April");
//                    break;
//                case 5:
//                    System.out.println("May");
//                    break;
//                case 6:
//                    System.out.println("June");
//                    break;
//                case 7:
//                    System.out.println("July");
//                    break;
//                case 8:
//                    System.out.println("August");
//                    break;
//                case 9:
//                    System.out.println("September");
//                    break;
//                case 10:
//                    System.out.println("October");
//                    break;
//                case 11:
//                    System.out.println("November");
//                    break;
//                case 12:
//                    System.out.println("December");
//                    break;
//                default:
//                    System.out.println("Please enter integer value between 1-12 in CMD");
//                    break;
//            }
        } else System.out.println("Please enter integer value between 1-12 in CMD");
    }
}
