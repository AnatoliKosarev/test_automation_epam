package org.example.java_fundamentals.optional_task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalSubtask4 {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();
        List<Integer> list = listCreator.addValuesToList();

        if (!list.isEmpty()) {
            int resultValue = list.get(0);
            int resultUniqueLength = getNumberOfUniqueDigits(list, 0);

            for (int i = 1; i < list.size(); i++) {
                int elementUniqueLength = getNumberOfUniqueDigits(list, i);
                if (resultUniqueLength > elementUniqueLength) {
                    resultValue = list.get(i);
                    resultUniqueLength = elementUniqueLength;
                }
            }

            System.out.println("Число, в котором количество различных цифр минимально = " +
                    resultValue + ", количество различных цифр в числе = " + resultUniqueLength + ".");
        } else System.out.println("Значения не были введены.");
    }

    public static int getNumberOfUniqueDigits(List<Integer> list, int index) {
        String trimmedValue = list.get(index).toString().replaceAll("[^\\d]", "");
        char[] chars = trimmedValue.toCharArray();

        Stream<Character> cStream = IntStream.range(0, chars.length).mapToObj(j -> chars[j]);

        List<Character> uniqueDigitsList = cStream.distinct().collect(Collectors.toList());

        return uniqueDigitsList.size();
    }
}
