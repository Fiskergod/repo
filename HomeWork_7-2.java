package ru.geekbrains.hworks;

// Класс тарелка
public class Plate {
    private int food;

    // Конструктор
    public Plate(int food) {
        this.food = food;
    }

    // Добавление еды в тарелку
    public void addFood(int food) {
        this.food += food;
    }

    // Делаем так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    boolean decreaseFood(int n) {
        int balance = food - n;
        if (balance <= 0) return false;

        food -= n;
        return true;
    }

    public void info() {
        System.out.println("Тарелка " + food);
    }

}
