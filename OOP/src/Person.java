public class Person { //Tên class tuân theo quy tắc Pascal Case
    public String name; // Các thuộc tính thì luôn có giá trị mặc định tùy theo kiểu dữ liệu
    public int age;
    public boolean isHandSome; // default: false

    public Person(String name, int age, boolean isHandSome) {
        this.name = name;
        this.age = age;
        this.isHandSome = isHandSome;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHandSome = true;
    }

    // Khi không khai báo constructor nó sẽ tự có 1 constructor không tham số
    public Person() {

    }
    // Có thể có nhiều hàm tạo (constructor) trong một lớp
    // Các hàm tạo trùng tên với tên class;

    // Đây là cú pháp tạo một phương thức
    public void go() {
        System.out.println(this.name + " Đang chạy");
        // Từ khóa this sẽ đại diện cho đối tượng đang sử dụng lớp
    }

    @Override
    public String toString() { // Dùng để in ra đối tượng
        return "Người này có tên " + this.name + " và có tuổi là " + this.age;
    }
}

// Tạo một lớp Car có cân nặng, màu, số Bánh và có một phương thức chạy
// Sau đó tạo 3 đối tượng ở trong main

class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person("Hồng", 24, false);
        p2.go();

        Person p3 = new Person("Nong", 3);
        p3.go();
        System.out.println(p3);
    }
}



