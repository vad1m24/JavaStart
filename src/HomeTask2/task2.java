package HomeTask2;

import java.io.File;

public class task2 {
    /**
     * Напишите метод, который определит тип (расширение) файлов из текущей папки
     * и выведет в консоль результат вида
     * 1 Расширение файла: txt
     * 2 Расширение файла: pdf
     * 3 Расширение файла:
     * 4 Расширение файла: jpg
     */
    public static void main(String[] args) {
        File file = new File("java1.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("java2.pdf");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("java3");
        System.out.println("Расширение файла: " + getFileExtension(file));

        file = new File("java4.jpg");
        System.out.println("Расширение файла: " + getFileExtension(file));
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0){
            return fileName.substring(fileName.lastIndexOf(".")+1);
        }else {
            return "";
        }
    }
}
