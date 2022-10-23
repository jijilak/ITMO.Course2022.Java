package ITMO.Laboratory1;

import java.util.Scanner;

public class Exersize6 {
   /* public static void main(String[] args) {
        int a = 124;
        //int a = 12;
        //int a = 123;

        if (a % 2 == 0 && a > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (a % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }
    }*/
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число больше ноля");
        int a = sc.nextInt();
        if (a % 2 == 0 && a > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (a % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }
    }
}
