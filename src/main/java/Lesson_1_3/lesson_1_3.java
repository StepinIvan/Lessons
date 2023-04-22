package Lesson_1_3;

import java.util.Arrays;
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        значениями 1 2 3 4 5 6 7 8 … 100;

        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        умножить на 2;

        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
        диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
        [1][1], [2][2], …, [n][n];

        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
        одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        массива равны.


        8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
        положительным, или отрицательным), при этом метод должен сместить все элементы массива
        на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
        вспомогательными массивами.  */


public class lesson_1_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeOneToZeroAndBack(array)));

        int[] array2 = new int[100];
        System.out.println(Arrays.toString(fillArray(array2)));

        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyToTwoIfLessThanSix(array3)));

        int[][] array4 = new int[3][3];
        printArrayWithFilledDiagonals(array4);

        System.out.println(Arrays.toString(createArray(5, 4)));

        int[] array5 = new int[]{1,2,3,44,5,6,7};
        findMinAndMaxArraysValue(array5);

        int[] array6 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkLeftAndRightEquals(array6));

        int[] array7 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shiftSign(array7, -2)));
    }
    public static int[] changeOneToZeroAndBack (int[] array) {
        for (int i =0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] fillArray(int[] array) {
        for (int i =0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] multiplyToTwoIfLessThanSix(int[] array) {
        for (int i = 0; i< array.length; i++){
            if (array[i] < 6) {
                array[i] = array[i]*2;
            }
        }
        return array;
    }
    public static void printArrayWithFilledDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j || (i + j) == (array.length -1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] createArray (int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
    public static void findMinAndMaxArraysValue(int[] array) {
        int minValue = 100000000;
        int maxValue  = -10000000;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minValue) {
                minValue = array[i];
            }
            else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве = " + maxValue);
        System.out.println("Минимальное значение в массиве = " + minValue);
    }

    public static boolean checkLeftAndRightEquals(int[] array) {
        int point = 0;
        int leftSum = 0;
        int rightSum = 0 ;
        for (int i = 0; i < array.length; i++) {
            point ++;
            for (int j = 0; j < point; j++) {
                leftSum += array[j];
            }
            for (int k = point; k < array.length; k++) {
                rightSum += array[k];
            }
            if (leftSum == rightSum) {
                return true;
            }
            leftSum = 0;
            rightSum = 0;
        }
        return false;
    }

    public static int[] shiftSign(int[] array, int shiftIndex) {
        int temp;
        if ( shiftIndex > 0 ){
            for (int i = 0; i < shiftIndex; i++) {
                temp = array[array.length-1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j-1];
                }
                array[0] = temp;
            }
        } else {
            for (int i = 0; i > shiftIndex; i--) {
                temp = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = temp;
            }
        }

        return array;
    }
}
