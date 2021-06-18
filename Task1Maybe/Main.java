package JavaHard.Task1Maybe;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("BUgatti");
        car1.setModel("12");
        car1.setPrice(200000);
        car1.setSpeed(Speed.FAST);
        car1.bite();

        LinkedList<String> list = new LinkedList<>();
        list.add("Green");

        String [] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));

        Car car2 = new Car();
        car2.setName("Lamborgini");
        car2.setModel("12");
        car2.setPrice(200000);
        car2.setSpeed(Speed.VERY_FAST);
        car2.bite();

        Car car3 = new Car();
        car3.setName("BWM");
        car3.setModel("12");
        car3.setPrice(200000);
        car3.setSpeed(Speed.AVG);
        car3.bite();

        Car car4 = new Car();
        car4.setName("BWM");
        car4.setModel("12");
        car4.setPrice(200000);
        car4.setSpeed(Speed.LOW);
        car4.bite();

        for(Speed s : Speed.values()) {
            System.out.println(s.getId() + " " + s.getAbbr());
        }

    }
}
