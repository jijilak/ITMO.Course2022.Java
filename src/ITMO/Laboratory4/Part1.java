package ITMO.Laboratory4;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        P1Ex1();
        P1Ex2();
        P1Ex3();
        P1Ex4();
        P1Ex5();
        P1Ex6();
    }
    private static void P1Ex1() {
        int i = 1;
        while (i <= 99) {
            System.out.println(i + " - нечётное число диапазона 1-99");
            i += 2;
        }
    }
    public static void P1Ex2() {
        System.out.println("\nЧисло, которое делится на 3: ");
        int a = 3;
        while (a <= 100 && a != 0) {
            System.out.println(a + " ");
            a += 3;
        }
        System.out.println("\nЧисло, которое делится на 5: ");
        int b = 5;
        while (b <= 100 && b != 0) {
            System.out.println(b + " ");
            b += 5;
        }
        System.out.println("Число, которое делится на 15: ");
        int c = 15;
        while (c <= 100 && c != 0) {
            System.out.println(c + " ");
            c += 15;
        }
    }
    private static void P1Ex3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите третье число: ");
        int c = in.nextInt();
        if (a + b == c) {
            System.out.println("Результат: true, т.к. сумма равна третьему целому числу");
        } else {
            System.out.println("Результат: false, т.к. сумма не равна третьему целому числу!");
        }
    }
    private static void P1Ex4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите третье число: ");
        int c = in.nextInt();
        if (a < b && c > b) {
            System.out.println("Результат: true, т.к. второе число больше первого числа, а третье число больше второго числа");
        }
        else {
            System.out.println("Результат: false, т.к. не удовлетворяет условию");
        }
    }
    /*private static boolean P1Ex5() {
        int[] array = new int[] {-3, 1, 5, 8, 9, 3};
        if (array[0] == 3 || array[array.length - 1] == 3){
            System.out.println("array = " + Arrays.toString(array) + "\ntrue");
        }
        else {
            System.out.println("array = " + Arrays.toString(array) + "\nfalse");
        }
    }*/
    private static boolean P1Ex5() {
        int[] array = new int[]{1, -6, 1, 5, 7, 3};

        if (array[0] == 1 || array[array.length - 1] == 1) {
            System.out.println("array = " + Arrays.toString(array) + "\ntrue, массив содержит число 1 или 3 как первый или последний элемент массива целых чисел");
            return true;
        } else if (array[0] == 3 || array[array.length - 1] == 3) {
            System.out.println("array = " + Arrays.toString(array) + "\ntrue, массив содержит число 1 или 3 как первый или последний элемент массива целых чисел");
            return true;
        } else {
            System.out.println("array = " + Arrays.toString(array) + "\nfalse, массив не содержит заданных чисел");
            return false;
        }
    }
    private static boolean P1Ex6() {
        int[] array = new int[]{1, -6, 1, 9, 8, 3, -5};

        if (array[0] == 1 || array[0] == 3) {
            System.out.println("array = " + Arrays.toString(array) + "\ntrue, массив содержит число 1 или 3");
            return true;
        } else {
            System.out.println("array = " + Arrays.toString(array) + "\nfalse, массив не содержит заданные числа");
            return false;
        }
    }
}