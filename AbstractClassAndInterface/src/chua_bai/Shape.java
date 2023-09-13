package chua_bai;

public abstract class Shape {
    public abstract double getArea();
}

abstract class Shape2 extends Shape {
    public abstract double getP();
}

class Circle extends Shape2 {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getP() {
        return 0;
    }
}
