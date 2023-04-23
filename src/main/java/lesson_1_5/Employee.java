package lesson_1_5;

import java.sql.SQLOutput;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String jobPosition;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String surname, String name,String patronymic, String jobPosition, String email, String phoneNumber, double salary, int age ) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void infoEmployee(){
        System.out.println("ФИО:" + " " + surname + " " + name + " " + patronymic + ";");
        System.out.println("Должность:" + " " + jobPosition + ";");
        System.out.println("Email:" + " " + email + ";");
        System.out.println("Номер телефона:" + " " + phoneNumber + ";");
        System.out.println("Заработная плата:" + " " + salary + " руб." + ";");
        System.out.println("Возраст:" + " " + age +  ";");
        System.out.println();
    }
    public int getAge(){
        return age;
    }
}
