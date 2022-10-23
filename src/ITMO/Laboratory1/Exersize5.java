package ITMO.Laboratory1;

import java.util.Scanner;

public class Exersize5 {
    /*public static void main(String[] args) {
        byte a = 1;
        int b = (a + a);
        int c = (b + a);
        int d = (b + b);
        int e = (d + a);
        int f = (c + c);
        int j = (f + a);
        int i = (e + c);
        int h = (j + b);

        System.out.println(a + b + c + d + e + f + j + i + h - c);
        System.out.println(e * b * e * b);
        System.out.println(e * e * e);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try {
        System.out.println();
        System.out.println("Введите первое целое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите третье целое число: ");
        int num3 = sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        // }
        // Если BufferedReader, то ловим исключения:
        // catch (IOException ex) {
        //System.out.println("Ошибка: Вы ввели не целое число. " + ex.getMessage());
        // }
    }
}

