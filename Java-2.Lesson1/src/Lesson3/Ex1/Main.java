package Lesson3.Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] array = {"кошка", "яблоко", "кошка", "яблоко", "собака", "пень", "валик", "гора", "пень",
                "пень", "игрушка", "собака"};
        ArrayList<String> list = new ArrayList<>();
        list.add(array[0]);
        for (int i = 0; i < array.length; i++) {
            int k = 0;
            for (int j = 0; j < list.size(); j++) {
                if (array[i].equals(list.get(j))) {
                    k++;
                }
            }
            if (k == 0) {
                list.add(array[i]);
            }
        }
        System.out.println(list.toString());
    }
}
