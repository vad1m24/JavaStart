package Lesson2;

public class task2 {
    public static void main(String[] args) {
        /**
         * aaaabbbcdd -> a4b3cd2
         */
        System.out.println(compress("aaabbyyywwwwwwwwh"));
    }

    private static String compress(String source) {

        StringBuilder str = new StringBuilder();

        int count = 1;

        char simple = source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i) == simple) {
                count++;
            } else {

                if (count == 1) {
                    str.append(simple);
                } else {
                    str.append(simple).append(count);
                    count = 1;
                }
                simple = source.charAt(i);
            }
        }
        if (count == 1) {
            str.append(simple);
        } else {
            str.append(simple).append(count);
        }
        return str.toString();
    }
}
