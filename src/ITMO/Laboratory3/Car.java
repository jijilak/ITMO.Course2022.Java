package ITMO.Laboratory3;
class Car {
    private String name;
    private String color;
    private String weight;

    public Car () {}
    public Car(String name){
        this.name = name;
    }
    public Car(String color, String weight){
        this.color = color;
        this.weight = weight;
    }

    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    String getWeight(){
        return weight;
    }

    public  String printCar(){
        return "Название: " + name +"; Цвет: " + color + "; Вес: " + weight;
    }
}
