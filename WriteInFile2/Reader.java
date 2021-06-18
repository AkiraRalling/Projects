package JavaHard.WriteInFile2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public void readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public List<Student> readObjects(String file) {
        List<Student> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(file)))) {
            boolean keepReading = true;
            while (keepReading) {
                Student student = (Student) ois.readObject();
                if (!"".equals(student.getName())) {
                    list.add(student);
                } else {
                    keepReading = false;
                }
            }
        } catch (IOException ioException) {
            System.out.println("IOException");
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return list;
    }
}
