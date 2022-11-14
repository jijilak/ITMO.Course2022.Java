package ITMO.Laboratory6;

public class Cat extends Animals {
private String name;
public void  setName(){
    System.out.println("Введите имя животного: ");
    name = in.nextLine();
}
public String getName(){
    return name;
}
    public void printNum(){
        System.out.println("Возраст животного: " + getNum());
    }
/*
    public Cat(String name, int years, int summ, String kindOfAnimals) {
        super(summ, kindOfAnimals);
        this.name = name;
        this.years = years;
    }
    public void outPut() {
    }*/
}
