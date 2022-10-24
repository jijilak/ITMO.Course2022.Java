package ITMO.Laboratory2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую цифру");
        int a = sc.nextInt();
        System.out.println("Введите вторую цифру");
        int b = sc.nextInt();
        Calculator cator = new Calculator();
        System.out.println("Сумма");
        System.out.println(cator.sum (a, b));
        System.out.println("Деление");
        System.out.println(cator.division (a, b));
        System.out.println("Умножение");
        System.out.println(cator.multiplication (a, b));
        System.out.println("Вычитание");
        System.out.println(cator.subtraction (a, b));
    }
}