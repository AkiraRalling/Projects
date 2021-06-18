package JavaHard.WriteInFile2;

import java.io.Serializable;

public class StudentGrade implements Serializable {

    private int grade;
    private String discipline;

    public StudentGrade(int grade, String discipline) {
        this.grade = grade;
        this.discipline = discipline;
    }

    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "grade=" + grade +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
