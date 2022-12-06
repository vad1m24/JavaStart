package HomeTask1;

import java.util.Scanner;

public class task5 {
    /**
     * Написать метод, который определяет, является ли год високосным, и возвращает boolean
     * (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интересующий Вас год: ");
        int a = sc.nextInt();
        leapYear(a);

    }

    private static boolean leapYear(int a) {
        if ((a % 4 != 0) || ((a % 100 == 0) && (a % 400 != 0))){
            System.out.println("Год не високосный ");
            return false;
        } else {
            System.out.println("Год високосный ");
            return true;
        }
    }
}
