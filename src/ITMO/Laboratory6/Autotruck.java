package ITMO.Laboratory6;

public class Autotruck extends Car {
    public int numberOfWheels;
    public int maxWeight;
    public Autotruck(int w, String m, char c, float s, int numberOfWheels, int maxWeight){
    super(w, m, c, s);
    this.numberOfWheels = numberOfWheels;
    this.maxWeight = maxWeight;
    }
    public  void newWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колёс: " + numberOfWheels);
    }
}
