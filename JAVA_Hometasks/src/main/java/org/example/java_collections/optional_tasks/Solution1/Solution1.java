package org.example.java_collections.optional_tasks.Solution1;

import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {

        //Read from file
        File file = new File("src\\main\\java\\org\\example\\collections\\optional_tasks" +
                "\\Solution1\\test_file.txt");
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Original file line order:");
        printList(list);

        //Reverse list elements
        Collections.reverse(list);

        //Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String value : list) {
                writer.write(value + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reversed file line order:");
        printList(list);
    }

    public static void printList(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
}
