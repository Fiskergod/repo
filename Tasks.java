package ru.geekbrains.hworks.hw14;

/* Task 1: Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
           Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
           идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
           необходимо выбросить RuntimeException.
   Task 2: Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки
           или единицы, то метод вернет false */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks {

    // Task 1
    public int[] pullOut(int[] input) {
        if (input.length == 0)
            throw new RuntimeException("Хотя бы один элемент должен быть в массиве");

        final int SEPARATOR = 4;
        boolean hasSeparator = false;
        List<Integer> output = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == SEPARATOR) {
                hasSeparator = true;
                break;
            }
            output.add(input[i]);
        }

        if (!hasSeparator)
            throw new RuntimeException("В массиве нет ни одного элемента со значением: " + SEPARATOR);

        Collections.reverse(output);

        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    // Task 2
    public boolean checkArray(int[] input) {

        final int NEEDED_NUMBER_ONE = 1;
        final int NEEDED_NUMBER_TWO = 4;

        for (int element : input) {
            if (element == NEEDED_NUMBER_ONE || element == NEEDED_NUMBER_TWO) {
                return true;
            }
        }

        return false;
    }
}