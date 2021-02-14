package ru.geekbrains.HWs;

// Евгений, с вашего позволения, вывел все на 1 страницу, для удобства отправки и проверки.

/* Task 1: Создать классы Собака и Кот с наследованием от класса Животное. 
Task 2: Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
 препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
  -> 'Бобик пробежал 150 м.');
Task 3: У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
 кот не умеет плавать, собака 10 м.). 
Task 4: * Добавить подсчет созданных котов, собак и животных. */

// Создаем супер класс и задаем одинаковые типы данных для всех животных.
public class Animal {
    String name;
    int run;
    static int creatureCounter = 0;


    public Animal(String name) {
        this.name = name;

        creatureCounter += 1;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

}

// Создаем наследованный подкласс Cat с индивидуальными типами данных.
public class Cat extends Animal {
    protected final boolean swim;

// Конструктор
    public Cat(String name, int run, boolean swim) {
        super(name);
        this.run = run;
        this.swim = swim;
    }

    public void catInfo() {
        System.out.println("Имя кота: " + name + ", " + "Дистанция бега: " + run + " " + "метров" + ", " +
                "Дистанция заплыва: " + swim);
    }

}

// Подкласс Dog.
public class Dog extends Animal {
    private final int swim;

// Конструктор
    public Dog(String name, int run, int swim) {
        super(name);
        this.run = run;
        this.swim = swim;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name + ", " + "Дистанция бега: " + run + " " + "метров" + ", " +
                "Дистанция заплыва: " + swim + " " + "метров");
    }

}


public class homeWork_6 {

    public static void main(String[] args) {

        Cat cat = new Cat("Афоня", 200, false);
        cat.animalInfo();
        cat.catInfo();


        Dog dog = new Dog("Степка", 500, 10);
        dog.animalInfo();
        dog.dogInfo();

// Выводим количество имеющихся созданий.
        System.out.println(Animal.creatureCounter);

    }

}
