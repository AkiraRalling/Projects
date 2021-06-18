package JavaHard.Collections.SetInterface;

public class Car implements Comparable<Car> {

    private final String brand;
    private final String model;
    private final Integer price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        if (!this.brand.equals(car.getBrand())) {
            return false;
        }
        if (!this.model.equals(car.getModel())) {
            return false;
        }
        return this.price.equals(car.getPrice());
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result+=31 * model.hashCode();
        result+=31 * price.hashCode();

        return result;
    }

    @Override
    public int compareTo(Car car) {
        if(this.price < car.getPrice()) {
            return -1;
        } else if(this.price > car.getPrice()) {
            return +1;
        } else if(this.price == car.getPrice()) {
            return this.model.compareTo(car.getModel());
        }
        return 0;
    }

    @Override
    public String toString() {
        return getModel() + ": " + getBrand() + " " + getPrice();
    }
}
