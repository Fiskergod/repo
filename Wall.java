package ru.geekbrains.hworks.hw8;

    // Создаем подкласс Стена, при прохождении через которую, участники должны выполнить прыжок.
    // Результат выполнения печатаем в консоль.
public class Wall extends Obstacle {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean act(Participants participants) {
        System.out.println("Стена: " + super.getName() + ", " + "Высота: " + this.heigth);

        participants.jump();

        if (getHeigth() <= participants.getJumpHeight()) {
            System.out.println("Прыжок успешный!");

            return true;

        } else {
            System.out.println("Прыжок не успешен");

            return false;
        }
    }
}
