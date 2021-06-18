package JavaHard.Collections.StackQueue;

public class MusicalInstruments implements Comparable <MusicalInstruments> {
    private int price;
    private String name;
    private String producer;

    public MusicalInstruments(int price, String name, String producer) {
        this.price = price;
        this.name = name;
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "MusicalInstruments{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }




    @Override
    public int compareTo(MusicalInstruments mus2) {
        if(this.price < mus2.getPrice()) {
            return -1;
        } else if (this.price > mus2.getPrice()) {
            return +1;
        } else if (this.price == mus2.getPrice()) {
            return this.name.compareTo(mus2.getName());
        } else {
            return 0;
        }
        
    }
}
