package Imple;

import Inter.Flyable;

class Main2 {
    public static void main(String[] args) {
        // Flyable f = new Flyable();
        // Không thể khởi tạo đối tượng từ interface.

        Plane plane = new Plane();
        // Interface định nghĩ thêm kiểu dữ liệu mới.
        System.out.println(plane.fly());

        Flyable bird = new Bird();
        System.out.println(bird.fly());
        System.out.println(Flyable.A);
        Flyable.go();
        bird.run();
    }
}