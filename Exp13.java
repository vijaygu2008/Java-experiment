
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

class NameComparator implements Comparator<Student> {
    
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Vijay"));
        students.add(new Student(101, "Arun"));
        students.add(new Student(104, "Kumar"));
        students.add(new Student(102, "Bala"));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new NameComparator());

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
