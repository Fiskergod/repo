package ru.geekbrains.hworks.hw8;

import java.util.Random;

public class homeWork_8 {

    public static void main(String[] args) {
        Random rand = new Random();

        // Создаем массив с участниками.
        Participants[] participants = new Participants[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(5);
        participants[0] = new Human("Данила", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(5);
        participants[1] = new Cat("Вилли", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(5);
        participants[2] = new Robot("Модель - 101", distance, height);

        // Создаем массив с препятствиями и заставляем всех пройти этот набор препятствий.
        Obstacle[] obstacles = new Obstacle[5];

        boolean isTreadmill;
        for (int i = 0; i < obstacles.length; i++) {
            distance = rand.nextInt(5);
            isTreadmill = rand.nextBoolean();
            if (isTreadmill) {
                obstacles[i] = new Treadmill("Беговая дорожка " + i, distance);

            } else {
                obstacles[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < participants.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {

                result = obstacles[j].act(participants[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Отлично!");

            } else {
                System.out.println("Плохо");
            }
        }
    }
}
