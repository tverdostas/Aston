package school.lessons;

import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        printPositOrNegatNumb(0);
        printPositOrNegatNumBool(-1);
        printStrings(3, "привет");
        array();
        isLeapYear(2024); // если просто вызвать метод из main

        // Для отладки isLeapYear использовала следующий блок кода:
        /* int year = 100;
        boolean isLeap = isLeapYear(year);
        System.out.println("Год " + year + " високосный? " + isLeap);*/

        hundredArray();
        exercise12();
        twoDimentionalArray(10);
        exercise14(5, 5);
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple" + "\n");
    }

    public static void checkSumSign() {
        int firstNumber = 1;
        int secondNumber = -20;
        int sum = firstNumber + secondNumber;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = -5;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void printPositOrNegatNumb(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean printPositOrNegatNumBool(int number) {
        if (number < 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void printStrings(int stringsQuantity, String str) {
        for (int i = 0; i < stringsQuantity; i++) {
            System.out.println(str);
        }
    }

    public static void array() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static void hundredArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1; // если не добавить условие i+1, массив начнётся с 0, закончится на 99
        }
        System.out.println(Arrays.toString(array)); // добавила вывод в консоль для отладки, по условию его нет
    }

    public static void exercise12() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void twoDimentionalArray(int n) {
        int[][] myTwoDimentionalArray = new int[n][n]; // создание двумерного массива с размером  n x n
        for (int i = 0; i < n; i++) {
            myTwoDimentionalArray[i][i] = 1; // у элементов главной диагонали индексы совпадают
            myTwoDimentionalArray[i][n - 1 - i] = 1; // чтобы найти элементы побочной диагонали, использовано выражение i + j = n - 1 из свойств побочной диагонали матриц
        }
        // Вывод массива в консоль
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myTwoDimentionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] exercise14(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}