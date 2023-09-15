import java.util.ArrayList;
import java.util.Locale;

public class StudentManager {
    private Student[] listStudent;
    private int size;

    public StudentManager() {
        size = 0;
        this.listStudent = new Student[100];
    }

    public ArrayList<Student> getStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(listStudent[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(listStudent[i]);
            }
        }
        return students;
    }

    public double getAvgClazz() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudent[i].getAvg();
        }
        return sum / size;
    }

    public double getMaxAvg() {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            if(this.listStudent[i].getAvg() > max) {
                max = this.listStudent[i].getAvg();
            }
        }
        return max;
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        this.size++;
    }

    public void delete(int id) {
        int index = findById(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public void edit(int id, Student newStudent) {
        int index = findById(id);
        this.listStudent[index] = newStudent;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.listStudent[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public Student findStudentById(int id) {
        for (Student student : this.listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public Student[] getListStudent() {
        return this.listStudent;
    }

    public int getSize() {
        return size;
    }


}
