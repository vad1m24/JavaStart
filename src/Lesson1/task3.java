package Lesson1;

import java.util.Scanner;

public class task3 {
    /**
     *Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая найдет индекс i для этого массива такой,
     * что сумма элементов с индексами < i равна сумме элементов с индексами > i.
     */
    public static void main (String[] args) {
        int[] array = {1,7,3,6,5,6};
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                sumLeft = sumLeft + array[j];
            }
            for (int h = i + 1; h < array.length; h++){
                sumRight = sumRight + array[h];
            }
            if (sumLeft == sumRight){
                System.out.println(i);
            }
            sumLeft = 0;
            sumRight = 0;
        }
    }
}

