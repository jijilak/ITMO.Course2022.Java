package ITMO.Laboratory6;

public class EmployeeOfTheBank extends Human {
    private String bankName;

    public EmployeeOfTheBank(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAll() {
        return "Имя служащего: " + getName() + "\nФамилия: " + getLastName() + "\nБанк: " + bankName;
    }
}
