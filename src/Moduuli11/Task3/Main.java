package Moduuli11.Task3;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Umut Uygur", 19);
        Course course = new Course("CS101", "Umut's course", "Dr. Umut");
        Enrollment enrollment = new Enrollment(student, course, "2024-02-13");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            outputStream.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to enrollments.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) inputStream.readObject();
            System.out.println("Deserialized Enrollment:");
            System.out.println("Student: " + deserializedEnrollment.getStudent().getName());
            System.out.println("Course: " + deserializedEnrollment.getCourse().getCourseName());
            System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
