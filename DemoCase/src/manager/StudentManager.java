package manager;

import model.Student;
import readAndWrite.RWStudent;
import java.util.List;

public class StudentManager implements IManager<Student> {
    private List<Student> studentList;
    private RWStudent rwStudent = new RWStudent();
    public StudentManager() {
        studentList = rwStudent.readFile();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        rwStudent.writeFile(studentList);
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if(index == -1) {
            return false;
        }
        this.studentList.remove(index);
        rwStudent.writeFile(studentList);
        return true;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if(id == studentList.get(i).getId()) return i;
        }
        return -1;
    }

    @Override
    public boolean edit(int id, Student student) {
        int index = findById(id);
        if(index == -1) {
            return false;
        }
        this.studentList.set(index, student);
        rwStudent.writeFile(studentList);
        return true;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
