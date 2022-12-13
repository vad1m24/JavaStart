package Lesson3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class task1 {
    public static void main(String[] args) {
        /**
         * Заполнить список десятью случайными числами.
         * Отсортировать список методом sort() и вывести его на экран.
         */

//            int randomInteger = ThreadLocalRandom.current().nextInt(10); // [0, 9]
        Random random = new Random();
        random.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}