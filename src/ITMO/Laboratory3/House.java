package ITMO.Laboratory3;

import java.util.Calendar;

public class House {
    private int numberOfFloors;
    private int yearOfBuild;
    private String name;

    public House(){
    }
    void setHouse(int numberOfFloors, int yearOfBuild, String name){
        this.numberOfFloors = numberOfFloors;
        this.yearOfBuild = yearOfBuild;
        this.name = name;
    }
    public String getHouse () {
        return "Name: " + name + ", number of floors: "+ numberOfFloors + ", year of build: " + yearOfBuild;
    }
    public int getYearsOfConstruction () {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - yearOfBuild;
    }
}
