package ru.geekbrains.hworks.hw11;

import java.util.ArrayList;
import java.util.List;

// Создаем унаследованный от фруктов класс Коробка
public class Box<Type extends Fruit> {

    // Хранение фруктов внутри коробки
    private final List<Type> box = new ArrayList<>();

    public float getWeight() {
        float weight = 0.0f;
        for (Type o : box) {
            weight += o.getWeight();

        }return weight;
    }

    // Добавляем фрукты
    public void addFruit(Type fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    // Сравниваем коробки
    public boolean compare(Box anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    // Пересыпаем фрукты
    public void pourOutTo(Box<Type>anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }
}
