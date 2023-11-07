package org.example;

import java.sql.SQLOutput;

public class HomeWorkApp_2 {
    public static void main(String[] args) {
        System.out.println(checkSumValue(25,-7));
        checkValueSign(-5);
        System.out.println(checkValueSignBoolean(7));
        printString("String", 2);
        System.out.println(checkTypeOfYear(1968));
    }

    public static boolean checkSumValue(int firstValue, int secondValue) {
        if (firstValue + secondValue >= 10 && firstValue + secondValue <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkValueSign (int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkValueSignBoolean (int value) {
        if (value >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void printString (String string, int numberOfTimes) {
        for (int i = 0; i <+ numberOfTimes; i++) {
            System.out.println(string);
        }
    }

    public static boolean checkTypeOfYear (int year) {
        if ((year%4 == 0 && year != 100)|| year == 400) {
            return true;
        } else {
            return false;
        }
    }
}
