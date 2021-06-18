package JavaHard.WriteInFile2;

import java.util.Objects;

public class AvgGrade implements Comparable<AvgGrade>{

    private String name;
    private float avg;

    public AvgGrade(String name, float avg) {
        this.name = name;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public float getAvg() {
        return avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvgGrade avgGrade = (AvgGrade) o;
        return Float.compare(avgGrade.avg, avg) == 0 && Objects.equals(name, avgGrade.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avg);
    }

    @Override
    public int compareTo(AvgGrade avg) {
        if(this.avg < avg.getAvg()) {
            return -1;
        } else if (this.avg > avg.getAvg()) {
            return +1;
        } else {
            return this.name.compareTo(avg.getName());
        }
    }
}
