package ru.geekbrains.hworks.hw8;

    // Создаем интерфейс участников т. к. они не наследуются от одного класса.
public interface Participants {
    void run();

    void jump();

    int getRunDistance();

    int getJumpHeight();
}
