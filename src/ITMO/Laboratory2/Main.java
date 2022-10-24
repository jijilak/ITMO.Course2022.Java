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
        System.out.println(cator.multiplication (a, b));
    }
}