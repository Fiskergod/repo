package ru.geekbrains.hworks.hw8;

    // Создаем абстрактный, наследуемый суперкласс Препятствия. У препятствий есть длина (для дорожки) или
    // высота (для стены), а у участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
    // то дальше по списку препятствий он не идет.
public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    protected abstract boolean act(Participants participants);

    public String getName() {
        return name;
    }
}
