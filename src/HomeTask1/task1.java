package HomeTask1;

import java.util.Scanner;

public class task1 {
    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        inputNumbers(a, b);
    }

    private static boolean inputNumbers(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
