package ITMO.Laboratory3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car1 = new Car("Volvo");
        Car car2 = new Car("black", "1865");
        Car car3 = new Car();
        Car car4 = new Car("Lada");
        Car car5 = new Car("white", "1730");

        System.out.println(car4.printCar());
        System.out.println(car5.printCar());
        System.out.println(car3.printCar());


        System.out.println( "House");
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(5, 1762, "Hermitage-Winter Palace");
        house2.setHouse(4, 1848, "Beloselsky-Belozersky Palace");

        System.out.println(house1.getHouse());
        System.out.println(house2.getHouse());
        System.out.println("Hermitage-Winter Palace (years from the date of construction)");
        System.out.println(house1.getYearsOfConstruction());
        System.out.println("Beloselsky-Belozersky Palace (years from the date of construction)");
        System.out.println(house2.getYearsOfConstruction());
    }
}
