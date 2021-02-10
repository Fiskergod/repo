package ru.geekbrains.homework3;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {


        /* Task 1: Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки
               угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
               чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
               1 – да / 0 – нет»(1 – повторить, 0 – нет). */

        Scanner input = new Scanner(System.in); // выделение памяти
        Random numbers = new Random();
        int try3 = 0; // даем 3 попытки
        int random = numbers.nextInt(9); // загадываем случайные числа от 0 - 9
        System.out.print("Угадайте число с 3-х попыток. ");

        while (try3 < 3) {
            System.out.print("Введите число от 0 до 9: ");
            int someNumber = input.nextInt(); // пользователь вводит число

            if (someNumber < random) {
                System.out.println("Вы ввели слишком маленькое число. Попробуйте еще раз: ");
                System.out.println("");

            } else if (someNumber > random) {
                System.out.println("Вы ввели слишком большое число. Попробуйте еще раз: ");
                System.out.println("");

            } else if (someNumber == random) {
                System.out.println("Вы угадали!");
                System.out.println("");
            }
            try3++; // подсчет попыток

        }

        System.out.print("Вы использовали все попытки. Хотите начать заново? Да - 1; Нет - 0: "); // даем возможность
        String userInfo = input.next(); // поиграть еще, либо выйти из игры
        if (userInfo.equals("1")) {

            main(null);

        }

    }

}
