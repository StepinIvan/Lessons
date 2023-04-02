package org.example.Lesson_1_2;

public class Lesson_1_2 {
    public static void main(String[] args) {
        System.out.println(checkSumValue(5, 17));
        printNumberSign(-5);
        System.out.println(checkSumSign(-5));
        printString("Correct", 2);
        System.out.println(checkYear(1996));
    }
    public static boolean checkSumValue(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }
    public static void printNumberSign(int a) {
        if (a > 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    public static boolean checkSumSign(int a) {
        return a > 0;
    }
    public static void printString(String string, int number) {
        for (int i = 0; i < number; i ++) System.out.println(string);
    }
    public static boolean checkYear(int year) {
        if ((year%4 == 0 && year%100 !=0) || (year%400 == 0 && year%100 ==0)) return true;
        else return false;
    }
}
