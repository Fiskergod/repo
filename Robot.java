package ru.geekbrains.hworks.hw8;

    // Создаем ненаследуемый класс Робот.
public class Robot implements Participants {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + ": " + "Пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + ": " + "Прыгнул " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
