package HomeTask1;

import java.util.Arrays;

public class task7 {
    /**
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        int numb = 0;
        for (int i = 0; i < arr.length; i++) {
            numb += 1;
            arr[i] = numb;
        }
        System.out.println(Arrays.toString(arr));
    }
}
