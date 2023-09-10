public class Car {
    public String name;
    public String color;
    public double weight;

    public Car(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void go() {
        System.out.println(this.name +  " Đang Bay!!!");
    }
}


class Main2 {
    public static void main(String[] args) {
        Car oto1 = new Car("Mec", "Đỏ", 23.4);
        oto1.go();
        Car oto2 = new Car("Lambo", "Đen", 23.4);
        oto2.go();
    }
}
