package HomeTask1;

public class task12 {
    /**
     * Найти общий префикс среди слов из одного массива.
     * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
     */
    public static void main(String[] args) {
        String letter = "";
        String pref = "";
        int count = 0;
        String[] arr = {"aaa", "aab", "aa"};
        char[] word1 = arr[0].toCharArray();
        for (int i = 0; i < word1.length; i++) {
            letter = letter + word1[i];
            for (int j = 0; j < arr.length; j++) {
                if (letter.length() <= arr[j].length() && arr[j].contains(letter)) {
                    count++;
                    if (count == arr.length) {
                        pref = letter;
                    }
                }
            }
            count = 0;
        }
        System.out.println(pref);
    }
}