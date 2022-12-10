package Lesson2;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;


/**
 * 1. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 * 2. Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 */

   /* ath file = Path.of("file.txt");

    String result = Files.readString(file);
        System.out.println(result);

        Files.writeString(file, "New content");


    Path file = Path.of("dir","file.txt");
    Path dir = Path.of("dir");

        System.out.println(file.getFileName().toString());
    boolean directory = Files.isDirectory(file);
        System.out.println(directory);
        System.out.println(Files.isRegularFile(dir));*/



public class task3 {
    public static void main(String[] args) throws IOException {
        Path directories_info = Paths.get("list.txt");
        if (!Files.exists(directories_info)) {
            Files.createFile(directories_info);
        }
        Path file = Paths.get("");
        List<String> str = new ArrayList<>();
        List<Path> Derictories = Files.list(file).collect(Collectors.toList());
        int size = Derictories.size();
        for (int i = 0; i < size; i++) {
            Path p = Derictories.get(i);
            str.add(p.toString());
        }
        try {
            Files.write(directories_info, str);
        } catch (IOException e) {
        }
    }
}