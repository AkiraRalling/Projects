package JavaHard.WriteInFile;

public class PersonGrade {
    private final int grade;
    private final String discipline;

    public PersonGrade(int grade, String discipline) {
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
        return "PersonGrade{" +
                "grade=" + grade +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
