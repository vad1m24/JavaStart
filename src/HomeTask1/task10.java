package HomeTask1;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = sc.nextInt();
        System.out.println("Введите значение ячейки массива");
        int initialValue = sc.nextInt();
        arrValues(len, initialValue);
    }

    private static int[] arrValues(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
