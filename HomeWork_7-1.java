package ru.geekbrains.hworks;

public class homeWork_7 {

    public static void main(String[] args) {

        // Массив котят с именами и аппетитом
        Kitten[] kittens = {new Kitten("Прапор", 40), new Kitten("Жорик", 30),
                new Kitten("Васька", 20), new Kitten("Петька", 5),
                new Kitten("Барсик", 10)};

        // Наполнение миски и вывод инфо
        Plate plate = new Plate(100);
        plate.info();

        for (Kitten kitten : kittens) {
            kitten.eat(plate);
            kitten.infoHungry();
        }

    }

}
