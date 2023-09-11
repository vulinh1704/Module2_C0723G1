package chua_bai;

public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int idIncrement = 1;
    public static int countObject = 0;
    public static double maxRadius = 0;
    public static double sumS = 0;


    public Circle(double radius) {
        this.id = idIncrement;
        this.radius = radius;
        idIncrement++;
        countObject++;

        // Tìm max của các hình trong
        if (radius > maxRadius) {
            maxRadius = radius;
        }

        double s = getS();
        sumS = sumS + s;
    }

    public double getS() {
        return PI * Math.pow(this.radius, 2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( 5.3);
        System.out.println(circle.getId());
        Circle circle2 = new Circle( 5.1);
        System.out.println(circle2.getId());
        Circle circle3 = new Circle( 6.1);
        System.out.println(circle3.getId());
        System.out.println("Số lượng đối tượng của lớp circle là: " + Circle.countObject);
        System.out.println("Hình tròn có bán kính lớn nhất là : " + Circle.maxRadius);
        System.out.println("Tổng diện tích của các hình tròn là : " + Circle.sumS);
    }
}
