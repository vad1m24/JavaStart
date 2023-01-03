package HomeTask6.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        oopDemo();
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

    }
}
