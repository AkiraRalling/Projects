package JavaHard.WriteInFile2;

import JavaHard.WriteInFile.AvgGrades;

import java.io.*;
import java.util.*;

public class IOFile {

    private static final String FILE_NAME = "writer.txt";
    private static final String BINARY_FILE_NAME = "Students.bin";

    public static void main(String[] args) throws IOException {
        SortedMap<AvgGrades, Set<StudentGrade>> map = TreeMapRunner.createMap();
        Reader reader = new Reader();
        Writer writer = new Writer();
        writer.writeFile(map, FILE_NAME);
        reader.readFile(FILE_NAME);
        processGrades(map, writer, BINARY_FILE_NAME);
        outputObjects(reader,BINARY_FILE_NAME);
        //writer.formaterWriter();
    }

    private static void processGrades(SortedMap<AvgGrades, Set<StudentGrade>> map, Writer writer, String fileName) {
        List<Student> list = new ArrayList<>();
        for (AvgGrades avg : map.keySet()) {
            list.add(new Student(avg.getAvg(), avg.getName(), map.get(avg)));
        }
        writer.writeObject(list, fileName);
    }

    private static void outputObjects(Reader reader, String filename) {
        List<Student> students = reader.readObjects(filename);
        for (Student student : students) {
            System.out.printf("%s, %.2f, %n", student.getName(), student.getAvg());
            System.out.println(student.getSet());
        }
    }
}
