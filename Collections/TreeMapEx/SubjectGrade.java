package JavaHard.Collections.TreeMapEx;

import java.util.Objects;

public class SubjectGrade implements Comparable<SubjectGrade>{

    public final int grades;
    private final String learnObjects;

    public SubjectGrade(int grades, String learnObjects) {
        this.grades = grades;
        this.learnObjects = learnObjects;
    }

    public int getGrades() {
        return grades;
    }

    public String getLearnObjects() {
        return learnObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectGrade that = (SubjectGrade) o;
        return grades == that.grades && Objects.equals(learnObjects, that.learnObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grades, learnObjects);
    }

    @Override
    public String toString() {
        return "SubjectGrade{" +
                "grades=" + grades +
                ", learnObjects='" + learnObjects + '\'' +
                '}';
    }

    @Override
    public int compareTo(SubjectGrade that) {
        return this.learnObjects.compareTo(that.getLearnObjects());
    }
}
