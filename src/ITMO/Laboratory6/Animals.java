package ITMO.Laboratory6;

import java.util.Scanner;

public class Animals {
    private int num;
    public void setNum (){
        System.out.println("Введите возраст животного: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
    }
    public int getNum(){
        return num;
    }
}
