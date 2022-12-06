package HomeTask1;

import java.util.Arrays;
import java.util.Scanner;

public class task11 {
    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] < min){
                min = arr[i];
            } else if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);
    }
}
