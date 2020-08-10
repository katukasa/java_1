package ru.geekbrains.java_1.lesson_1.homework;

public class Homework1 {
    public static void main(String[] args) {
        method1(1,1,2,3);
        method2(16, 17);
        method3(-6);
        System.out.println(method4("Катя"));
    }

    private static double method1(int a, int b, int c, int d) {
        double e = c;
        double v = a * (b + (e / d));
        return v;
    }

    private static boolean method2(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    private static void method3(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.");
        } else {
            System.out.println("Число " + a + " отрицательное.");
        }
    }

    private static String method4(String name) {
        String hello = "Привет, " + name + "!";
        return hello;
    }

}
