package HomeTask3;

import java.util.*;

public class task2 {
    /**
     *   Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        random.nextInt();

        System.out.println("Введите длинну списка");
        int len = sc.nextInt();
        List<Integer> numbers = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);

        IntSummaryStatistics stats = new IntSummaryStatistics();
        for (int num : numbers) {
            stats.accept(num);
        }

        System.out.println("Минимальный элемент " + stats.getMax());
        System.out.println("Максимальный элемент " + stats.getMin());
        System.out.println("Среднее арифметическое всех элементов " + stats.getAverage());
    }
}