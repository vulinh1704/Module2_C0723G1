package readAndWrite;

import model.Student;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RWStudent {
    private File file = new File("student.csv");
    public void writeFile(List<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: students) {
                line += student.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String[] points = data[2].split(";");
                Student student = new Student(Integer.parseInt(data[0]), data[1], Double.parseDouble(points[0]), Double.parseDouble(points[1]), Double.parseDouble(points[2]));
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
}
