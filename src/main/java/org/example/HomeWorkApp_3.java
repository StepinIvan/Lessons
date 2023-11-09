package org.example;

import java.util.Arrays;

public class HomeWorkApp_3 {
    public static void main(String[] args) {
        //1
        int[] array_1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < array_1.length; i++) {
            if (array_1[i] == 1) {
                array_1[i] = 0;
            } else {
                array_1[i] = 1;
            }
        }
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i] + " ");
        }
        System.out.println();

        //2
        int[] array_2 = new int [100];
        for (int i = 0; i < array_2.length; i++) {
            array_2[i] = i + 1;
        }
        System.out.println();
        for (int i = 0; i < array_2.length; i++) {
            System.out.print(array_2[i] + " ");
        }
        System.out.println();

        //3
        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array_3.length; i++) {
            if (array_3[i] < 6) {
                array_3[i] *= 2;
            }
        }
        System.out.println();
        for (int i = 0; i < array_3.length; i++) {
            System.out.print(array_3[i] + " ");
        }
        System.out.println();

        //4
        int[][] array_4 = new int[4][4];
        for (int i = 0; i < array_4.length; i++) {
            for (int j = 0; j < array_4.length; j++) {
                if (i == j || j == array_4.length - i - 1) {
                    array_4[i][j] = 1;
                }
                else {
                    array_4[i][j] = 0;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array_4.length; i++) {
            for (int j = 0; j < array_4.length; j++) {
                System.out.print(array_4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //5
        System.out.println();
        System.out.print(Arrays.toString(createArray(4, 2)));
        System.out.println();

        //6
        int[] array_6 = {1, -1, 2, 30, -4, 6};
        int tempMin = array_6[0];
        int tempMax = array_6[0];
        for (int i = 0; i < array_6.length; i++) {
            if (tempMin > array_6[i]) {
                tempMin = array_6[i];
            }
            if (tempMax < array_6[i]){
                tempMax = array_6[i];
            }
        }
        System.out.println("tempMin " + tempMin);
        System.out.println("tempMax " + tempMax);
        System.out.println();
    }
    public static int[] createArray (int length, int initialValue){
        int[] array_5 = new int[length];
        Arrays.fill(array_5, initialValue);
        return array_5;
    }
}
