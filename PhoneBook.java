package ru.geekbrains.hworks.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Создаем класс телефонный справочник
public class phoneBook {

    private HashMap<String, HashSet<String>> map;

    phoneBook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phoneNumber) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        map.put(lastName, numbers);
    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}