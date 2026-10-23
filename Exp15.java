
import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vijay", 8.5);

        try {
            FileOutputStream fos =
                    new FileOutputStream("student.ser");
            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();

            System.out.println("Serialization successful.");
            FileInputStream fis =
                    new FileInputStream("student.ser");
            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();

            System.out.println("\nDeserialization successful.");
            System.out.println("\nStudent Details:");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
