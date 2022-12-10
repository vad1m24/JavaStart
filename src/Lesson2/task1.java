package Lesson2;

public class task1 {

    public static void main(String[] args) {
        /**
         * Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N,
         * которая состоит из чередующихся символов c1 и c2, начиная с c1
         */
        System.out.println(buildString(6, 'a', 'b'));
    }

    private static String buildString(int n, char c1, char c2) {
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2==0) {s.append(c1);}
            else {s.append(c2);}


        }

        return s.toString();
    }


}
