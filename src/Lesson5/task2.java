package Lesson5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    /**
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * Пример 1: () - истина
     * Пример 2: [() - ложь
     * Пример 3: [()] - истина
     * Пример 4: {}[]{()} - истина
     * Пример 5: <{}{()}> - истина
     * Пример 6: {]}{()} - ложь
     */
    public static void main(String[] args) {
        System.out.println(isCorrect("()") + " should be true");
        System.out.println(isCorrect("[()") + " should be false");
        System.out.println(isCorrect("[()]") + " should be true");
        System.out.println(isCorrect("{}[]{()}") + " should be true");
        System.out.println(isCorrect("<{}{()}>") + " should be true");
        System.out.println(isCorrect("{]}{()}") + " should be false");
    }

    private static boolean isCorrect(String sequence) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        Deque<Character> symbols = new ArrayDeque<>();
        char[] chars = sequence.toCharArray();
        for (char c:chars) {
            if(symbols.isEmpty() || map.containsKey(c)){
                symbols.addFirst(c);
            } else {
                Character character = symbols.pollFirst();
                Character open = map.get(c);
                if(!character.equals(open)){
                    return false;
                }
            }
        }
        return symbols.isEmpty();
    }
}