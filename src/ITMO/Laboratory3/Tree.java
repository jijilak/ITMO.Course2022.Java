package ITMO.Laboratory3;

public class Tree {
    private int years;
    private boolean isAlive;
    private String name;

    Tree () {
        System.out.println("Пустой конструктор без параметров сработал");
    }
    Tree (int years, boolean isAlive, String name){
        this.years = years;
        this.isAlive = isAlive;
        this.name = name;

        System.out.println("Параметры дерева: " + "\nВозраст = " + years + "\nЖивое ли = " + isAlive + "\nНазвание = " + name + "\n");
    }
    Tree (int years, String name){
        this.years = years;
        this.name = name;

        System.out.println("Параметры дерева: " + "\nВозраст = " + years + "\nНазвание = " + name + "\n");
    }
}
