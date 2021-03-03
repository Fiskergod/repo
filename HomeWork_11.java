package ru.geekbrains.hworks;

/* Task 1: Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
   Task 2: Написать метод, который преобразует массив в ArrayList;
   Task 3: Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну
        коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
        в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать
        коробки с яблоками и апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку
        фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается,
        а в другую перекидываются объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку. */

import ru.geekbrains.hworks.hw11.Apple;
import ru.geekbrains.hworks.hw11.Box;
import ru.geekbrains.hworks.hw11.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class homeWork_11 {

    public static void main(String[] args) {

        // Task 1. Меняем местами 1 и 3 элементы массива
        Integer[] array = new Integer[10];
        Integer temp = array[1];
        array[1] = array[3];
        array[3] = temp;

        // Task 2. Используем метод Arrays.asList ()
        String[] stringsArray = {"a", "b", "c", "d", "e"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringsArray));

        System.out.println(arrayList);

        // Task 3.
        // Коробки с яблоками
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox.addFruit(new Apple(),10);
        appleBox2.addFruit(new Apple(), 11);

        System.out.println("Коробка с яблоками 1: " + appleBox.getWeight() + " кг.");
        System.out.println("Коробка с яблоками 2: " + appleBox2.getWeight() + " кг.");

        // Коробки с апельсинами
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        orangeBox.addFruit(new Orange(), 8);
        orangeBox2.addFruit(new Orange(), 9);

        System.out.println("Коробка с апельсинами 1: " + orangeBox.getWeight() + " кг.");
        System.out.println("Коробка с апельсинами 2: " + orangeBox2.getWeight() + " кг.");

        // Сравнение коробок
        System.out.println("Равны ли Коробка с яблоками 1 и Коробка с апельсинами 1? : " + orangeBox.compare(appleBox));
        System.out.println("Равны ли Коробка с яблоками 2 и Коробка с апельсинами 2? : " + orangeBox2.compare(appleBox2));

        // Пересыпаем фрукты
        System.out.println("Пересыпаем коробки: ");
        appleBox.pourOutTo(appleBox2);
        orangeBox.pourOutTo(orangeBox2);
    }
}
