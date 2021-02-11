package ru.geekbrains.HWs;

// Task 1: Создаем класс 'Сотрудник' с полями.
public class Employee {
    private String name;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

// Task 2: Конструктор класса.
    public Employee(String _name, String _position, String _eMail, String _phone, int _salary, int _age) {
        this.name = _name;
        this.position = _position;
        this.eMail = _eMail;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }

    int getAge() { // Переменная для вывода возраста.
        return age;
    }

// Task 3: Метод, выводящий инфо об обьекте в консоль.
    public void print() {
        System.out.println("ФИО: " + name + ", " + "Должность: " + position + ", " + "Почта: " + eMail + ", " +
            "Телефон: " + phone + ", " + "Зарплата: " + salary + ", " + "Возраст: " + age);
    }

}


    public static void main(String[] args) {

// Task 4: Создаем массив и для каждой ячейки задаем обьект.
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Петров Петр Петрович", "Уборщик", "pPetr@mail.ru",
                "89162222222", 30000, 40);
        persArray[1] = new Employee("Серегин Сергей Сергеевич", "Директор", "direc@mail.ru",
                "89163333333", 100000, 50);
        persArray[2] = new Employee("Александров Сан Саныч", "Механик", "mech@mail.ru",
                "89164444444", 40000, 35);
        persArray[3] = new Employee("Аркадьев Аркаша Аркашкин", "Бухгалтер", "buh@mail.ru",
                "89165555555", 45000, 34);
        persArray[4] = new Employee("Арсеньев Арсен Арсенович", "Инженер", "ing@mail.ru",
                "89166666666", 55000, 45);

// Task 5: С помощью цикла выводим информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) persArray[i].print();
        }

    }

}
