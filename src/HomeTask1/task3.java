package HomeTask1;

import java.util.Scanner;

public class task3 {
    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        inputNumber(a);
    }

    private static boolean inputNumber(int a) {
        if (a >= 0){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
