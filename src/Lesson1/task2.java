package Lesson1;

import java.util.Scanner;

public class task2 {
        /**
         * Текст задачи:
         * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         * Java по курс на пожаловать Добро
         */
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст");
            String text = sc.nextLine(); // состоит из слов и пробелов
            // TODO: 06.12.2022 Развернуть строку и вывести в консоль.
            String wrd = "";
            int i = 0;
            String[] words = text.split(" ");
            for (i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }
    }