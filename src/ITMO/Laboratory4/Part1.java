package ITMO.Laboratory4;

import java.util.Scanner;

public class Part1 {
    public static  void  main(String[] args) {
        P1Ex1();
        P1Ex2();
        P1Ex3();
        P1Ex4();
        //P1Ex5();
        //P1Ex6();
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
        if (a + b == c){
            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: сумма не равна третьему целому числу!");
        }
    }
    private static void P1Ex4() {

    }
}
