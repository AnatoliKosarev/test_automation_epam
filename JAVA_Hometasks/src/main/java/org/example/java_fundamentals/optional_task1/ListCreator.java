package org.example.java_fundamentals.optional_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final List<Integer> list = new ArrayList<>();
    private int intValue = 0;


    public List<Integer> addValuesToList() {
        System.out.println("->Пожалуйста, введите числовые значения в консоль. " +
                "\n->После каждого значения нажмите 'Enter'. " +
                "\n->Если ввод окончен - нажмите 'Enter' еще раз.");

        try {
            while (true) {
                String value = reader.readLine();
                if (!value.isEmpty()) {
                    try {
                        intValue = Integer.parseInt(value);
                    } catch (Exception e) {
                        System.out.println("Пожалуйста, вводите только числовые значения");
                        System.exit(0);
                    }
                    list.add(intValue);
                } else break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
