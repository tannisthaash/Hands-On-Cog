package MVCPatternExample;

public class MVCTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rahul");
        student.setId("101");
        student.setGrade("A");
        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        System.out.println("\nUpdating Student Details...\n");

        controller.setStudentName("Sneha");
        controller.setStudentGrade("B+");

        controller.updateView();
    }
}