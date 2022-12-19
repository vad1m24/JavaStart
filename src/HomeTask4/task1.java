package HomeTask4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     * > first~1
     * > third~3
     * > print~1
     * < first
     * > print~2
     * < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> dataBase = new LinkedList<>();
        fillInAndOut(sc, dataBase);
    }

    private static void fillInAndOut(Scanner sc, LinkedList<String> dataBase) {
        String str;
        do {
            str = sc.next();
            if (str.contains("~") && str.length() > 2) {
                int pointNumber = getPointNumber(str);
                if (pointNumber > dataBase.size() && (!str.contains("print"))) {
                    for (int i = dataBase.size(); i < pointNumber; i++) {
                        dataBase.add(i, "");
                    }
                }
                String word = getWord(str);
                if (!str.contains("print")) {
                    if (pointNumber == dataBase.size()) {
                        dataBase.add(pointNumber, word);
                        System.out.println(dataBase);
                    } else {
                        dataBase.set(pointNumber, word);
                        System.out.println(dataBase);
                    }
                } else {
                    if (pointNumber >= dataBase.size() || pointNumber < 0){
                        System.out.println("Ошибка, такого элемента нет! Попробуй еще раз.");
                        fillInAndOut(sc, dataBase);
                    } else {
                        System.out.println(dataBase.get(pointNumber));
                        dataBase.remove(pointNumber);
                        System.out.println(dataBase);
                    }
                }
            } else {
                System.out.println("Ошибка ввода, данная операция невозможна. Bye-bye!");
                str = "quit";
            }
        } while (!str.equals("quit"));
    }

    private static int getPointNumber(String str) {
        String[] arrWords = str.split("~");
        int result = 0;
        if (arrWords.length != 2) {
            System.out.println("Ошибка ввода индекса элемента, данная операция невозможна.");
        } else {
            result = Integer.parseInt(arrWords[arrWords.length - 1]);
        }
        return result;
    }

    private static String getWord(String str) {
        String[] arrWords = str.split("~");
        String result = "";
        if (arrWords.length != 2) {
            System.out.println("Ошибка ввода эелемента, данная операция невозможна. Попробуй еще раз.");
        } else {
            result = arrWords[0];
        }
        return result;
    }
}