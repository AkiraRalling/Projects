package JavaHard.WriteInFile;

import java.util.Objects;

public class AvgGrades implements Comparable<AvgGrades>{

    private final float avg;
    private final String name;

    public AvgGrades(float avg, String name) {
        this.avg = avg;
        this.name = name;
    }

    public float getAvg() {
        return avg;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvgGrades avgGrades = (AvgGrades) o;
        return Float.compare(avgGrades.avg, avg) == 0 && Objects.equals(name, avgGrades.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, name);
    }

    @Override
    public String toString() {
        return "AvgGrades{" +
                "avg=" + avg +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(AvgGrades avg) {
        if(this.avg < avg.getAvg()) {
            return -1;
        }
        if(this.avg > avg.getAvg()) {
            return +1;
        }
        return 0;
    }
}
