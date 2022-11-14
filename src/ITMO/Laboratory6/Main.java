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
    }
}
