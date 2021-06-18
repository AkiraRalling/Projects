package JavaHard.Task1Maybe;

import java.util.LinkedList;

public class Car {

    private static int dogsCount;

    private int price;
    private Speed speed;
    private String name;
    private String model;

    LinkedList<String> list = new LinkedList<>();

    public Car() {
        dogsCount++;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 100000) {
            this.price = price;
        } else {
            System.out.println("Price is low. Should be 10000 or higher");
        }
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
       this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("Lamborgini") || name.equalsIgnoreCase("Bugatti") ||
            name.equalsIgnoreCase("BWM")) {
            this.name = name;
        } else {
            System.out.println("This name is incorrect. Should be BWM, Lamborgini or Bugatti");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void noise() {
        switch (speed) {
            case FAST: case VERY_FAST:
                System.out.println("It's Lamborgini Or Bugatti");
                break;
            case AVG:
                System.out.println("It's BMW");
                break;
            case LOW: case VERY_LOW:
                System.out.println("It's peace of sheet, man. R'u kidding me??");
                break;
            default:
                System.out.println("Wtf?");
        }
    }


    public void bite() {
        if(dogsCount >= 4) {
            System.out.println("Cars start riding");
        } else {
            noise();
        }
    }
}
