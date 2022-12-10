package HomeTask2;

public class task1 {
    /**
     * Напишите метод, который принимает на вход строку (String) и
     * определяет является ли строка палиндромом (возвращает boolean значение).
     * шалаш
     * abcdedcba
     */
    public static void main(String[] args) {
        poliandrom("abcdedcba");
    }

    private static boolean poliandrom(String word) {
        StringBuffer sb = new StringBuffer(word);
        String rev = String.valueOf(sb.reverse());

        if (word.equals(rev)){
            System.out.println("true");
            System.out.println(word + " является палиндромом");
            return true;
        } else {
            System.out.println("false");
            System.out.println(word + " не является палиндромом");
            return false;
        }
    }
}
