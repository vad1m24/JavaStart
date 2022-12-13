package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    /**
     * Заполнить список (названиями планет Солнечной системы) какими-то строкам в произвольном порядке с повторениями.
     * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("s1");
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        strings.add("s4");
        strings.add("s4");
        strings.add("s4");

        removeDuplicates(strings);

        System.out.println(strings); // [s1, s2, s3, s4]
    }

    private static void removeDuplicates(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (word.equals(list.get(j))) {
                    list.remove(j--);
                }
            }
        }
    }
}