package JavaHard.Collections.TreeMapEx;

import java.util.Objects;

public class AvgStudentGrade implements Comparable<AvgStudentGrade>{
    private final String name;
    private final float avg;

    public AvgStudentGrade(String name, float avg) {
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
        AvgStudentGrade that = (AvgStudentGrade) o;
        return Float.compare(that.avg, avg) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avg);
    }

    @Override
    public int compareTo(AvgStudentGrade avg) {
        if(this.avg < avg.getAvg()) {
            return -1;
        }

        if(this.avg > avg.getAvg()) {
            return +1;
        }
         return this.name.compareTo(avg.getName());
    }

    @Override
    public String toString() {
        return "AvgStudentGrade{" +
                "name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}
