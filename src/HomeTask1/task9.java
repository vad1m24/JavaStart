package HomeTask1;

import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввдите размер квадратного двумерного массива:");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int num = 1;
        int d = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    arr[i][j] = num;
                } else if (j == d) {
                    arr[i][j] = num;
                    d--;
                }
                System.out.printf("%2s", arr[i][j]);
            }
            System.out.println();
        }
    }
}
