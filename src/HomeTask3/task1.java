package HomeTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class task1 {
    /**
     *  Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
     */
    public static void main(String[] args) {
        int numSize = ThreadLocalRandom.current().nextInt(11);
        List<Integer> numbers = new ArrayList<>();
        Predicate<Integer> predicate = i -> i % 2 == 0;
        for (int i = 0; i < numSize; i++) {
            numbers.add((int) (Math.random() * 20));
        }
        System.out.println(numbers);

        remove(numbers, predicate);
    }

    public static <Integer> void remove(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.removeIf(predicate::test);
        System.out.println(numbers);
    }
}
