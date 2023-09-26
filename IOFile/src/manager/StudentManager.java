package manager;

import manager.dto.ReadAndWriteFileStudent;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> listStudent;
    private ReadAndWriteFileStudent readAndWriteFileStudent;

    public StudentManager() {
        readAndWriteFileStudent = new ReadAndWriteFileStudent();
        listStudent = readAndWriteFileStudent.readFile();
    }

    public void add(Student student) {
        listStudent.add(student);
        readAndWriteFileStudent.writeFile(listStudent);
    }

    public ArrayList<Student> getListStudent() {
        return this.listStudent;
    }
}


