package JavaHard.WriteInFile2;

import JavaHard.WriteInFile.AvgGrades;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Writer implements Serializable {

    public void writeFile(SortedMap<AvgGrades, Set<StudentGrade>> map, String file) {
        try (PrintWriter fw = new PrintWriter(file)) {
            for (AvgGrades st : map.keySet()) {
                fw.write("-------------------------------\n");
                fw.write("Grades: " + st.getAvg() + " / Person: " + st.getName() + "\n");
                for (StudentGrade student : map.get(st)) {
                    fw.write("Discipline: " + student.getDiscipline() + " / Grade: " + student.getGrade() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void formaterWriter() {
        Formatter formatter = new Formatter();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%s, %s, %.2f%n", scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.err.println("OOPS. Little problem");
            }
        }
    }

    public void writeObject(List<Student> list, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            for(Student student : list) {
                objectOutputStream.writeObject(student);
            }
            objectOutputStream.writeObject(new Student(-1, "", null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
