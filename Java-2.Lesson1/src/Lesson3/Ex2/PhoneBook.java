package Lesson3.Ex2;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Set<Data> phoneBook = new LinkedHashSet<>();
        add(phoneBook, "Иванов", "89257771234");
        add(phoneBook, "Петров", "89871234567");
        add(phoneBook, "Сидоров", "89257219865");
        add(phoneBook, "Сидоров", "89257219861");
        add(phoneBook, "Иванов", "89257771234");
        get(phoneBook, "Сидоров");
        get(phoneBook, "Иванов");
    }

    private static void add(Set<Data> data, String name, String phoneNum) {
        data.add(new Data(name, phoneNum));
    }

    public static void get(Set<Data> data, String name) {
        for (Data datum : data) {
            if (datum.getName().equals(name)) {
                System.out.println(datum);
            }
        }
    }
}
