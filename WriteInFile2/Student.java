package JavaHard.WriteInFile2;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable {

    private float avg;
    private String name;
    private Set<StudentGrade> set;

    public Student(float avg, String name, Set<StudentGrade> set) {
        this.avg = avg;
        this.name = name;
        this.set = set;
    }

    public float getAvg() {
        return avg;
    }

    public String getName() {
        return name;
    }

    public Set<StudentGrade> getSet() {
        return set;
    }
}
