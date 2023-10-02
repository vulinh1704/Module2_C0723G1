import manager.StudentManager;
import model.Student;
import readAndWrite.RWStudent;

public class Test {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        for (Student student: studentManager.findAll()) {
            System.out.println(student);
        }
    }
}
