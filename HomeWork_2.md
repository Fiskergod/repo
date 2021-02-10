package ru.geekbrains.homework2;

public class MainApp {

    public static void main(String[] args) {


            /* Task 1: Задать целочисленный массив, состоящий из элементов 0 и 1.
                       С помощью цикла и условия заменить 0 на 1, 1 на 0; */

            int arr[] = {1, 1, 0, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");

            }

            /* Task 2: Задать пустой целочисленный массив размером 8.
                       С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */

            int arr2[] = new int[8];
            arr2[0] = 0;
            for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[0] += 3;
            System.out.print(arr2[i] + " ");

            }

            /* Task 3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
                       и числа меньшие 6 умножить на 2; */

            int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    System.out.print(arr3[i] * 2 + " ");

                } else {
                    System.out.print(arr3[i] + " ");

                }

            }

            /* Task 4: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                       и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

            int arr4[][] = new int[4][4];
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                    if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                    System.out.print(arr4[i][j] + " ");

                }
                System.out.println();

            }

            /* Task 5: ** Задать одномерный массив и найти в нем минимальный и максимальный элементы. */

            int arr5[] = {4, 78, 33, 41, 23, 11, 1};
            int max = arr5[0];
            int min = arr5[0];
            for (int i = 0; i < arr5.length; i++) {
                if (arr5[i] > max) {
                    max = arr5[i];
                }

                else if (arr5[i] < min) {
                    min = arr5[i];
                }

                System.out.println("Максимальный элемент массива: " + max);
                System.out.println("Минимальный элемент массива: " + min);

            }


    }


}
