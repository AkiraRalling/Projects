package JavaHard.Collections.SetInterface;

import java.util.*;

public class SetRunner {
    public static void main(String[] mother) {
        Set<Car> bmw = new TreeSet<>();
        bmw.add(new Car("BMW","X5",7000532));
        bmw.add(new Car("BMW","X7",333002));
        bmw.add(new Car("BMW","MB3",7000409));
        bmw.add(new Car("BMW","LE2",820030));
        bmw.add(new Car("BMW","Som!2",9210200));

        Set<Car> audi = new TreeSet<>();
        audi.add(new Car("Audi","TT",11110532));
        audi.add(new Car("Audi","S-72",546002));
        audi.add(new Car("Audi","XS-22",8221409));
        audi.add(new Car("BMW","LE2",820030));
        audi.add(new Car("Audi","GT-2",92220200));

        NavigableSet<Car> set = new TreeSet<>(bmw);

        set.addAll(audi);
        printInfo(set);
        System.out.println();

        SortedSet<Car> cars = set.subSet(new Car("BMW", "LE2", 820030), true, new Car("Audi","XS-22",8221409), true);
        printInfo(cars);

        System.out.println("Higher");
        System.out.println(set.lower(new Car("Audi","GT-2",92220200)));

    }

    public static void printInfo(Set<Car> set) {
        System.out.printf("%-20s %-20s %-20s\n", "Car brand ", "Model", "Price");
        for (Car car : set) {
            System.out.printf("%-20s %-20s %-20s\n", car.getBrand(), car.getModel(), car.getPrice());
        }
    }
}
