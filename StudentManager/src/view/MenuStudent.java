package view;

import manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("========= Menu Student Manager ====== \n1.Thêm mới học sinh\n2.Sửa học sinh\n3.Xóa học sinh\n4.Hiển thị tất cả\n0.Thoát");
            System.out.println("Nhập lựa chọn");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showAll();
                    break;

            }
        } while (choice != 0);
    }

    public void showMenuEdit() {
        System.out.println("===== Menu edit ======");
        System.out.println("Nhập id muốn sửa: ");
        int idEdit = inputInt.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = inputInt.nextInt();
        System.out.println("Nhập địa chỉ: ");
        String address = inputString.nextLine();
        Student newStudent = new Student(idEdit, name, age, address);
        studentManager.update(idEdit, newStudent);
        System.out.println("====> Sửa thành công");
    }

    public void showMenuDelete() {
        System.out.println("==== Xóa học sinh ======");
        System.out.println("Nhập id: ");
        int idDelete = inputInt.nextInt();
        studentManager.delete(idDelete);
        System.out.println("======> Xóa thành công");
    }

    public void showMenuAdd() {
        System.out.println("==== Đây là menu thêm mới ====");
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = inputInt.nextInt();
        System.out.println("Nhập địa chỉ: ");
        String address = inputString.nextLine();
        Student student = new Student(name, age, address);
        studentManager.add(student);
        System.out.println("====> Thêm thành công");
    }

    public void showAll() {
        System.out.println("Danh sách sinh viên là: ");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student: list) {
            System.out.println(student);
        }
    }
}
