package ru.geekbrains.java_1.lesson_4.homework;

public class Employee {
    public String fullName;
    public int salary;
    public int age;

    public Employee(String fullName, int salary, int age) {
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
    }

    String getFullName(){
        return fullName;
    }

    int getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

}
