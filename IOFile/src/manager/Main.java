package manager;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
//        studentManager.add(new Student(1, "Linh3"));
        studentManager.add(new Student(3, "Xang"));

        for (Student student: studentManager.getListStudent()) {
            System.out.println(student);
        }
    }
}
