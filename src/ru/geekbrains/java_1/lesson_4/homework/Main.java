package ru.geekbrains.java_1.lesson_4.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Вывести при помощи методов из пункта 3 ФИО и возраст.
        Employee e1 = new Employee("Иванов Иван Иванович", 50000, 40);
        System.out.printf("ФИО: %s, возраст: %d\n", e1.getFullName(), e1.getAge());

        System.out.println();

        // Создать массив из 5 сотрудников.
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Сидоров Константин Пантелеймонович", 45000, 50);
        empArray[1] = new Employee("Красивая Галина Викторовна", 48000, 35);
        empArray[2] = new Employee("Хитрый Степан Алексеевич", 35000,30);
        empArray[3] = new Employee("Злоказова Антонина Андреевна",37500,47);
        empArray[4] = new Employee("Приходько Анатолий Федорович", 32000,25);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.printf("ФИО: %s, зарплата: %s, возраст: %d\n",
                        empArray[i].getFullName(), empArray[i].getSalary(), empArray[i].getAge());
            }
        }
    }
}
