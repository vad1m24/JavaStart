package HomeTask6.Task2;

import java.util.Arrays;
import java.util.HashSet;

/** Создать массив (int[]) из 1000 случайных элементов от 0 до 24.
     *  Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
     *  в данном массиве и верните его в виде числа с плавающей запятой (double)
     *  Для вычисления процента используйте формулу:
     *  процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 25);
        }
        System.out.println(Arrays.toString(arr));

        settingArray(arr);
    }

    private static void settingArray(int[] arr) {
        HashSet<Integer> h = new HashSet<Integer>();
        int numValue;
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        numValue = h.size();
        System.out.println(h);
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == n){
                    h.remove(n);
                }
            }
        }
        System.out.println(h);
        double unicPercent = (double)h.size() * 100 / (double)numValue;
        System.out.println(unicPercent);
    }

    // Поставил в длинну массива 100, тк в случае 1000 уникальные числа не выпадают. Слишком маленькая вероятность.

}
