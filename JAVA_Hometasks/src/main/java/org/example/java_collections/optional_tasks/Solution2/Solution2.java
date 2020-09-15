package org.example.java_collections.optional_tasks.Solution2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = reader.readLine();
            char[] array = value.toCharArray();
            Stack<Character> charStack = new Stack<>();
            for (Character character : array) {
                charStack.push(character);
            }
            while (!charStack.empty()) {
                System.out.print(charStack.pop());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
