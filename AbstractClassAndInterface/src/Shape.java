public abstract class Shape { // Lớp abstract
    private String color;
    private boolean filled;
    // Có thuộc tính, phương thức như lớp bình thường nhưng nó có thể chứa phương thức abstract

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {

    }


    public abstract double getArea();
    // Phương thức abstract: Không có triển khai cụ thể và chỉ ở mức khai báo

    public abstract double getP();

    public String getColor() {
        return color;
    } // Phương thức non-abstract

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Khi một lớp thường kế thừa lớp abstract
    //thì phải triển khai tất cả các phương thức abstract

    // Không bắt buộc phải ghi đè các phương non-abstract
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getP() {
        return 0;
    }
}

// Không sử dụng chung từ khóa final với abstract.


class Main {
    public static void main(String[] args) {
        // Shape s = new Shape(); Error
        // Lớp abstract thì không thể khởi tạo đối tượng
        Circle c = new Circle("Đỏ", true, 5.6);
        System.out.println("Diện tích là: " + c.getArea());
    }
}

