package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dop {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abcd");
        strings.add("bb");
        strings.add("cdeadfsdf");
        strings.add("ccsa");
        strings.add("aaaaa");

        System.out.println(strings);

        Collections.sort(strings);
        System.out.println(strings);

        // Сравнение по длине
        strings.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(strings);
    }
    /**
     1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
     2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */


}
