package ITMO.Laboratory2;

import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) throws Exception {
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
    }*/
    public static void main(String[] args){
        Friend friend1 = new Friend();
        Friend friend2 = new Friend("Morgan");
        Friend friend3 = new Friend("Ann", 1988);
        Friend friend4 = new Friend("Alex", 1989, "serious");
        Friend friend5 = new Friend("Dima", 1982, "kind", "casual");

        System.out.println(friend4.getName());
        System.out.println(friend4.getBday());
        System.out.println(friend4.getCharacter());
        System.out.println(friend4.getStyle());
    }
}