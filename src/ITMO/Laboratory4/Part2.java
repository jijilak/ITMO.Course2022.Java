package ITMO.Laboratory4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 3, 7, 5, 6, 2};
        int[] arrayB = new int[]{1, 4, 6, 8, 9};
        P2Ex1a(arrayA);
        P2Ex1b(arrayB);
        P2Ex2();
        P2Ex3();
        P2Ex4();
        P2Ex5();
        P2Ex6();
    }


    public static void P2Ex1a(int[] arrayA) {
        /*Напишите программу, которая проверяет отсортирован ли
        массив по возрастанию. Если он отсортирован по возрастанию
        то выводится “OK”, если нет, то будет выводиться текст
        “Please, try again”
         */
        boolean result = false;
        for (int i = 0; i < arrayA.length - 1; i++) {
            if (arrayA[i] < arrayA[i + 1]) {
                result = true;
            } else {
                result = false;
                System.out.println("Please, try again!");
                break;
            }
        }
        if (result) {
            System.out.println("OK!");
        }
    }

    public static void P2Ex1b(int[] arrayB) {
        /*Напишите программу, которая проверяет отсортирован ли
        массив по возрастанию. Если он отсортирован по возрастанию
        то выводится “OK”, если нет, то будет выводиться текст
        “Please, try again”
         */
        boolean result = false;
        for (int i = 0; i < arrayB.length - 1; i++) {
            if (arrayB[i] < arrayB[i + 1]) {
                result = true;
            } else {
                result = false;
                System.out.println("Please, try again!");
                break;
            }
        }
        if (result) {
            System.out.println("OK!");
        }
    }

    public static void P2Ex2() {
        /*Напишите программу, которая считывает с клавиатуры длину
         массива (например, пользователь вводит цифру 4),
         затем пользователь вводит 4 числа и на новой строке выводится
         массив из 4 элементов.
         Пример вывода:
        Array length: 4
        Numbers of array:
        5
        6
        7
        2
        Result: [5, 6, 7, 2]
        */
        Scanner scan = new Scanner(System.in);
        Scanner date = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        int i = 0;
        while ( i < arrayLength) {
            System.out.println("Вводите целые числа массива: ");
            int a = scan.nextInt();
            array[i] = a;
            i++;
        }
        System.out.println("Array length: " + arrayLength);
        System.out.println("Numbers of array: ");
        for (int b : array) {
            System.out.println(b);
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void P2Ex3() {
        /*Напишите метод, который меняет местами первый и
        последний элемент массива.
        Пример вывода:
        Array 1: [5, 6, 7, 2]
        Array 2: [2, 6, 7, 5]
        */

    }
    public static void P2Ex4() {
        /*Дан массив чисел. Найдите первое уникальное в этом массиве число.
Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
         */

    }
    public static void P2Ex5() {
        /*Заполните массив случайным числами и отсортируйте его.
        Используйте сортировку слиянием.
         */

    }
    public static void P2Ex6() {
        /* ***Прочитать главы 1-4 “Грокаем алгоритмы”
        *опционально
         */
    }
}