package demo;

import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {
    private final long serialVersionUID = 7873992404608128056L;
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student student = new Student(1, "Linh");
//        Student student1 = new Student(2, "Hiếu");
//        Student student2 = new Student(3, "Pink");
//        Student student3 = new Student(4, "Fuch");
//        ArrayList<Student> arrayList = new ArrayList<>();
//        arrayList.add(student);
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
//        objectOutputStream.writeObject(arrayList);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"));
        ArrayList<Student> students = (ArrayList<Student>) objectInputStream.readObject();
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
