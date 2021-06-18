package JavaHard.Collections.StackQueue;

public class Passenger {

    private String name;
    private String profession;
    private static int number;

    public Passenger(String name, String surname) {
        number++;
        this.name = name;
        this.profession = surname;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Person is " + name + " " + profession;
    }
}
