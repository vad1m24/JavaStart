package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    /**
     * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
     * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
     * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
     * буква может не меняться, а остаться такой же. (Например, note - code)
     * Пример 1:
     * Input: s = "foo", t = "bar" [f -> b, o -> a impossible]
     * Output: false
     * Пример 2:
     * Input: s = "paper", t = "title" [p -> t, a -> i, e -> l, r -> e]
     * Output: true
     */
    public static void main(String[] args) {
        System.out.println(isMapped("foo", "bar") + " should be false");
        System.out.println(isMapped("paper", "title") + " should be true");
        System.out.println(isMapped("add", "egg") + " should be true");
        System.out.println(isMapped("note", "code") + " should be true");
        System.out.println(isMapped("abcda", "edfdr") + " should be false");
    }

    private static boolean isMapped(String str1, String str2) {
        Map<Character, Character> words = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char first = str1.charAt(i); // p
            if (words.containsKey(first)){
                Character value = words.get(first); // t
                if (!value.equals(str2.charAt(i))){
                    return false;
                }
            }else{
                words.put(first,str2.charAt(i));
            }
        }
        return true;
    }

}
