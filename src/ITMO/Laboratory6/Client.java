package ITMO.Laboratory6;

public class Client extends Human {
    public String bankName;

    public Client(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAll() {
        return "Имя клиента: " + getName() + "\nФамилия: " + getLastName() + "\nБанк" + getBankName();
    }
}
