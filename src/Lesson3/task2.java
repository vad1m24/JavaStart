package Lesson3;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class task2 {
    /**
     * Заполнить список (названиями планет Солнечной системы) какими-то строкам в произвольном порядке с повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> found = new ArrayList<>();
        list.add("Меркурий");
        list.add("Марс");
        list.add("Венера");
        list.add("Меркурий");
        list.add("Земля");
        list.add("Меркурий");
        list.add("Юпитер");
        list.add("Юпитер");

        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (!found.contains(list.get(i))) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (word.equals(list.get(j))) {
                        count++;
                    }
                }
                System.out.println(word + " " + count);
                count = 1;
                found.add(word);
            }
        }
    }
}