
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "student.txt";

        try {
            // Write student details to the file
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Student Details");
            bw.newLine();
            bw.write("Roll No: 101");
            bw.newLine();
            bw.write("Name: Vijay");
            bw.newLine();
            bw.write("Department: CSE");

            bw.close();

            System.out.println("Data written successfully.");

            // Read student details from the file
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nReading data from file:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
