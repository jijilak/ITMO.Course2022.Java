package ITMO.Laboratory6;


public class Main {
    public static void  main(String[] arg){
        Client client = new Client("Jiji", "Lak", "VeraNadejdaLubov");
        EmployeeOfTheBank employeeOfTheBank = new EmployeeOfTheBank("Jack", "Black", "RussianRoulette");
        System.out.println("Rus");
        System.out.println(client.getAll());
        System.out.println(employeeOfTheBank.getAll());

        System.out.println("Eng");
        System.out.println("Client info: ");
        System.out.println("Bank: " + client.getBankName());
        System.out.println("Name: " + client.getName());
        System.out.println("Last name: " + client.getLastName());
        System.out.println("Bank info: ");
        System.out.println("Bank: " + employeeOfTheBank.getBankName());
        System.out.println("Name: " + employeeOfTheBank.getName());
        System.out.println("Last name: " + employeeOfTheBank.getLastName());

       // Autotruck autotruck = new Autotruck(4000 + " вес в кг", "Газель" + " - марка", " белый" + " - цвет кузова", 110 + " км/час", 6 + " шт", 5000 + " - максимальная грузоподъёмность в кг");
        Autotruck autotruck = new Autotruck(4000, "Газель", 'б', 110,  6, 5000);
        autotruck.outPut();
        autotruck.newWheels(7);

        //Cat cat = new Cat("Пуля", 7, 4, "кошка");
        //Cat cat = new Cat("Пуля");
        Cat cat = new Cat();
        cat.setNum();
        cat.printNum();
    }
}
