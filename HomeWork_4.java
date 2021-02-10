package ru.geekbrains.HWs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class homeWork_4 {
        // Поле
        private static char[][] map;
        private static final int SIZE = 5;
        private static final int DOT_TO_WIN = 5;

        // Ячейки поля
        public static final char DOT_EMPTY = '.';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static final char DOT_D = 'D';
        public static final char DOT_V = 'V';

        private static Scanner sc = new Scanner(System.in);
        private static Random rand = new Random();

        public static void main(String[] args) {

            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();

                if (checkWin(DOT_X)) {
                    System.out.println("Человек победил");
                    break;
                }

                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }

            aiTurn();
            aiTurn2();
            aiTurn3();
            printMap();

                if (checkWin(DOT_O)) {
                    System.out.println("Компьютер победил");
                    break;
                }

                if (checkWin(DOT_D)) {
                    System.out.println("Компьютер 2 победил");
                    break;
                }

                if (checkWin(DOT_V)) {
                    System.out.println("Компьютер 3 победил");
                    break;
                }

                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }

            System.out.println("Игра окончена");
        }

        private static void initMap() {
            map = new char[SIZE][SIZE];

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        // Вывод поля в консоль

        private static final void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }

            System.out.println();

            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");

                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println();

        }

        private static void humanTurn() {
            int x, y; // координаты

            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;

            } while (!isCellValid(x, y));

            map[x][y] = DOT_X;
        }

        private static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[x][y] == DOT_EMPTY) return true;
            return false;
        }

        private static void aiTurn() {
            int x, y; // координаты

            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);

            } while (!isCellValid(x, y));

            System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));

            map[x][y] = DOT_O;
        }

        private static void aiTurn2() {
            int x, y; // координаты

            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);

            } while (!isCellValid(x, y));

            System.out.println("Компьютер 2 сходил в точку " + (x + 1) + " " + (y + 1));

            map[x][y] = DOT_D;

        }

        private static void aiTurn3() {
                int x, y; // координаты

                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);

                } while (!isCellValid(x, y));

                System.out.println("Компьютер 3 сходил в точку " + (x + 1) + " " + (y + 1));

                map[x][y] = DOT_V;

        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }

            return true;
        }

        private static boolean checkWin(char symb) {

            if (checkDiagonal(symb)) return true;
            if (checkLanes(symb)) return true;

            return false;
        }

        public static boolean checkDiagonal(char symb) { // Проверка диагоналей
            boolean toright, toleft;
                toright = true;
                toleft = true;
                for (int i = 0; i < SIZE; i++) {
                    toright &= (map[i][i] == symb);
                    toleft &= (map[SIZE - i - 1][i] == symb);
                }

                if (toright || toleft) return true;

            return false;
        }
        public static boolean checkLanes(char symb) { // Проверка строк и столбцов
            boolean cols, rows;
                for (int col = 0; col < SIZE; col++) {
                cols = true;
                rows = true;
                    for (int row = 0; row < SIZE; row++) {
                        cols &= (map[col][row] == symb);
                        rows &= (map[row][col] == symb);
                    }

                if (cols || rows) return true;

                }

            return false;
        }

           /*
            if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;

            // Столбцы
            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;

            // Диагонали
            if (map[0][0]==symb &&map[1][1]==symb &&map[2][2]==symb)return true;
            if (map[0][2]==symb &&map[1][1]==symb &&map[2][0]==symb)return true;

            return false; */

    }
