package Lesson1;

public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        int result = method(array);
        System.out.println(result);
    }
    private static int method(int[] array) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == 1) {
                curr++;
            } else {
                if (curr > max) {
                    max = curr;
                }
                curr = 0;
            }
        }
        if (curr > max) {
            max = curr;
        }
        return max;
    }
}


