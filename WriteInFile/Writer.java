package JavaHard.WriteInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) throws IOException  {
        String [] array = {"Leo","Josh","Max"};
        writer(array);

        readerFile();
    }

    private static void readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("writer.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void writer(String[] array) {
        try (PrintWriter pw = new PrintWriter("writer.txt")) {
            for (String arr : array) {
                pw.write(arr + "\n");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
