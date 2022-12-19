package HomeTask4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    /**
     * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     * private static <T> List<T> reverse(LinkedList<T> source) {
     * return null;
     * }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> dataBase = new LinkedList<>();
        fillInData(sc, dataBase);
        reverse(dataBase);
    }

    private static Object reverse(LinkedList<Integer> dataBase) {
        for (int i = dataBase.size() - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(dataBase.get(i) + " -> ");
            } else{
                System.out.print(dataBase.get(i) + "\n");
            }
        }
        return dataBase;
    }

    private static Object fillInData(Scanner sc, LinkedList<Integer> dataBase) {
        Random random = new Random();
        System.out.println("Введите количество случайно сформированных элментов листа.");
        int dataBaseSize = sc.nextInt();
        for (int i = 0; i < dataBaseSize; i++) {
            int x = random.nextInt(100);
            dataBase.add(x);
            if (i != dataBaseSize - 1) {
                System.out.print(dataBase.get(i) + " -> ");
            } else {
                System.out.print(dataBase.get(i) + "\n");
            }
        }

        return dataBase;
    }


}
