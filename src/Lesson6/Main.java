package Lesson6;

import Lesson6.game.Cat;
import Lesson6.game.Plate;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * 1. Доделать задачу про кота.
     * Переделать флажок true\false сытность на хранение количества текущей энергии в диапазоне от 1 до 10
     *
     * 2. Создать массив (int[]) из 1000 случайных элементов от 0 до 24.
     * Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
     * в данном массиве и верните его в виде числа с плавающей запятой (double)
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7};
        Set<Integer> unique = new HashSet<>();
        for (int x : array) {
            System.out.println("Значение [" + x + "] еще не встречалось? " + unique.add(x));
        }

        System.out.println(unique);

    }

    private static void oopDemo() {
        // Создать кота. При создании должны указать аппетит (и энергию).
        // По-умолчанию кот голодный.
        // Покормить его.
        // Проверить, сытый ли он.

        Set<Cat> set = new HashSet<>();

        Plate plate = new Plate(250);

        Cat gav = new Cat("Gav", 200);
        System.out.println(gav.isSatiety()); // false
        gav.eat(plate);
        System.out.println(gav.isSatiety()); // true

        Cat murzik = new Cat("Murzik", 70);
        System.out.println(murzik.isSatiety()); // false
        murzik.eat(plate);
        System.out.println(murzik.isSatiety()); // false

        System.out.println("===============================");

        System.out.println(gav);
        System.out.println(murzik);
        System.out.println(plate);

        System.out.println(gav.equals(murzik));
        System.out.println(gav.equals(plate));
        Cat anotherGav = new Cat("Gav", 20);
        System.out.println(gav.equals(anotherGav));
        System.out.println(gav.hashCode() == anotherGav.hashCode());

        // A != B hash(A) == hash(A)

        // if A == B => hash(A) == hash(B)
        // if hash(A) == hash(B) !=> A == B
        // if hash(A) != hash(B) => A != B

        HashSet<Cat> cats = new HashSet<>();
        cats.add(gav);
        cats.add(anotherGav);
        System.out.println(cats);
    }

}
