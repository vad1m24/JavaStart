package HomeTask1;

import java.util.Scanner;

public class task4 {
    /**Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = sc.nextLine();
        System.out.println("Введите число повторений: ");
        int a = sc.nextInt();
        copyInput(text, a);
    }

    private static void copyInput(String text, int a) {
        for (int i = 0; i < a; i++)
            System.out.println(text);
    }
}
