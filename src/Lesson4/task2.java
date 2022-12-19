package Lesson4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {
        // java ....
        // > string
        // > ok
        // > java
        // > print
        // < [java, ok, string]
        // > revert
        // > print
        // < [ok, string]

        String str = "";
        Deque<String> deque = new LinkedList<>();
        do {
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            if ((!str.equals("print")) && (!str.equals("revert"))) {
                deque.addFirst(str);
            } else if (str.equals("print")) {
                System.out.println(deque);
            } else if (str.equals("revert")) {
                deque.pollFirst();
                System.out.println(deque);
            }

        }
        while (!str.equals("quit"));
    }
}