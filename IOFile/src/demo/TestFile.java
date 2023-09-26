package demo;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        File directory = new File("data");
        directory.mkdirs(); // Tạo thư mục trống
        file.createNewFile(); // Tạo file
        System.out.println(file.exists()); // Kiểm tra xem file tồn tại?
        System.out.println(file.isDirectory()); // Kiểm tra xem có phải isDirectory

        File file2 = new File("data/student.csv");
        file2.createNewFile();

        file2.delete();
        System.out.println(file.length());
    }
}
