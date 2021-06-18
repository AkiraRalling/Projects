package JavaHard.Task1Maybe;

import java.util.Iterator;

public enum Speed {
    VERY_LOW("20", 1), LOW("40", 2),AVG("60", 3),FAST("120", 4), VERY_FAST("200", 5);

    Speed(String abbr, int id) {
        this.abbr = abbr;
        this.id = id;
    }
    

    private String abbr;

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
