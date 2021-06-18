package JavaHard.WriteInFile;

import java.io.*;
import java.util.*;

public class IOMain {
    public final String FILE_NAME = "grade.txt";
    public static void main(String[] args) throws IOException {
        NavigableMap<AvgGrades, Set<PersonGrade>> avg = TreeMapRunner.createAvg();
        //printFile(avg);
        //readFile(FILE_NAME);
        writeWithFormatter();
    }

    private static void writeWithFormatter() throws FileNotFoundException {
        Formatter formatter = new Formatter("Book.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your FN, LN, and balance");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%s, %s, %.2f%n", scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException. Please try again");
                scanner.nextLine();
            }
        }
        formatter.close();
    }

    private static void readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void printFile(NavigableMap<AvgGrades, Set<PersonGrade>> avg) {
        try (PrintWriter fw = new PrintWriter("grade.txt")) {
            for (AvgGrades avgKey : avg.keySet()) {
                fw.write("--------------------------------------\n");
                fw.write("Grade: " + avgKey.getAvg() + " Person: " + avgKey.getName() + "\n");
                for (PersonGrade ps : avg.get(avgKey)) {
                    fw.write("Grades :" + ps.getGrade() + " Discipline: " + ps.getDiscipline() + "\n");
                }
            }
        } catch (IOException io) {
            System.out.println("IOException, my friend. Something is going wrong");
        }
    }
}
