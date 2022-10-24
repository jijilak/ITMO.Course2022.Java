package ITMO.Laboratory2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Calculator cator = new Calculator();
        System.out.println("Введите первую цифру");
        int a = sc.nextInt();
        System.out.println("Введите вторую цифру");
        int b = sc.nextInt();

        System.out.println("Сумма");
        double sum1 = cator.sum(a, b);
        System.out.println(sum1);
        System.out.println("Деление");
        double division1 = cator.division(a, b);
        System.out.println(division1);
        System.out.println("Умножение");
        double multiplication1 = cator.multiplication(a, b);
        System.out.println(multiplication1);
        System.out.println("Вычитание");
        double subtraction1 = cator.subtraction(a, b);
        System.out.println(subtraction1);
    }
}