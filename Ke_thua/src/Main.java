public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Hồng", 23, "Đen");
//        System.out.println(cat.getName());
//        cat.go(); // Mèo đang đi
//        cat.bark();
//        cat.bark2();
//        cat.eat("Cá");

               Animal a = new Cat("Hồng", 22, "Pink");
        // Kiểu khai báo   kiểu thực tế
        a.go(); // Mèo đang đi
    }
}

// Từ khóa final sử dụng với lớp thì sẽ không có lớp con kế thừa
// Từ khóa final sử dụng với phương thức thì các lớp con không được phép GHI ĐÈ
