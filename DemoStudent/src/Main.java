
public class Main {
    public static void main(String[] args) {
        StudentManager clazz = new StudentManager();
        double[] point1 = {1.5, 6.7, 8.9};
        Student student = new Student("Hồng", "Nam", point1);
        double[] point2 = {1.5, 6.7, 8.9};
        Student student2 = new Student("Hà", "Nam", point2);
        double[] point3 = {1.5, 6.7, 8.9};
        Student student3 = new Student("Hùng", "Nam", point3);

        clazz.add(student);
        clazz.add(student2);
        clazz.add(student3);
        System.out.println("Danh sách sinh viên: ");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);
        }

        double[] point4 = {1.53, 6.7, 8.9};
        Student student4 = new Student("Nong", "Nữ", point4);
        clazz.edit(3, student4);
        System.out.println("Danh sách sinh viên sau sửa: ");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);
        }
        System.out.println("Điểm trung bình của lớp là: " + (double) Math.round(clazz.getAvgClazz() * 1000) / 1000);
        System.out.println("Điểm trung bình lớn nhất là: " + clazz.getMaxAvg());

        System.out.println("Danh sách sinh viên có chữ h: ");
        for (Student student1 : clazz.getStudentByName("h")) {
            System.out.println(student1);
        }

//        System.out.println("Sinh viên cần tìm");
//        System.out.println(clazz.findStudentById(1));

//        clazz.delete(2);
//        System.out.println("Danh sách sinh viên sau xóa: ");
//        for (int i = 0; i < clazz.getSize(); i++) {
//            System.out.println(clazz.getListStudent()[i]);
//        }


    }

}
