package ru.geekbrains.hworks;

// Класс котенок
public class Kitten {
    private String name;
    private int appetite;
    private boolean hungry;

    // Конструктор
    public Kitten(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
    // Выводим инфо о состоянии котенка
    public void infoHungry() {
        String isHungry = !hungry ? "Сыт" : "Голоден";
        System.out.println(name + ": " + isHungry);
    }

}
