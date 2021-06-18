package JavaHard.Collections.ComparableInterface;

public class CarMain implements Comparable<CarMain> {

    private String name;
    private int year;

    public CarMain(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(CarMain car) {

        return 0;
    }
}
