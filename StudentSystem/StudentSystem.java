import java.util.ArrayList;
import java.util.List;

public class StudentSystem {

    private static final int EXCELLENT_SCORE = 100;
    private static final int GOOD_SCORE = 90;

    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, int score) {
        students.add(new Student(name, score));
    }

    public void showStudents() {

        for (Student student : students) {
            printStudentInfo(student);
        }

    }

    private void printStudentInfo(Student student) {

        int score = student.getScore();

        if (score == EXCELLENT_SCORE) {
            System.out.println("excellent " + student);
            return;
        }

        if (score >= GOOD_SCORE) {
            System.out.println("good " + student);
            return;
        }

        System.out.println(student);

    }

    public void printHeader() {
        System.out.println("students");
    }

}
