package ru.geekbrains.java_1.lesson_6.homework;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void createFile(String fileName){
        StringBuilder s1 = new StringBuilder("");
        int j = (int) (29 + (Math.random() * 25));
        for (int i = 0; i < j ; i++) {
            s1.append(i);
        }

        String s2 = s1.toString();
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(fileName ));
            ps.print(s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void mergeFiles(String fileName1, String fileName2){
        try {
            Scanner scanner = new Scanner(new FileInputStream(fileName2));
            while (scanner.hasNext()){
                PrintStream ps = new PrintStream(new FileOutputStream(fileName1, true));
                ps.print(scanner.nextLine());
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //    Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
        String file1 = "test1.txt";
        String file2 = "test2.txt";
        createFile(file1);
        createFile(file2);

        //    Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
        //    потом текст из второго.
        mergeFiles(file1,file2);

    }

}


