package ru.geekbrains.hworks.hw8;

    // Создаем подкласс Беговая дорожка, участники должны выполнить забег.
    // Результат выполнения печатаем в консоль.
public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean act(Participants participants) {
        System.out.println("Беговая дорожка: " + super.getName() + ", " + "Длина: " + this.length);

        participants.run();

        if (getLength() <= participants.getRunDistance()) {
            System.out.println("Пробежал успешно!");

            return true;

        } else {
            System.out.println("Не пробежал");

            return false;
        }
    }
}
