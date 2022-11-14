package ITMO.Laboratory6;

public abstract class Human {
    private String name;
    private String lastName;

    public Human(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract String getAll();
}
