import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double[] points;

    public Student(String name, int age, double[] points) {
        this.name = name;
        this.age = age;
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public double getAvg() {
        double sum = 0;
        for (double d: this.points) {
            sum += d;
        }
        double lengthPoints = this.points.length;
        return sum/lengthPoints;
    }
}


class Main10 {
    public static void main(String[] args) {
        double[] pointsSv1 = {1.0,4.0,6.5};
        Student sv1 = new Student("Hồng", 50, pointsSv1);

        double[] pointsSv2 = {9.0,5.7,6.5};
        Student sv2 = new Student("Linh", 18, pointsSv2);
        sv2.setAge(44);
        sv2.setName("Anh Huân");

        double avgSv1 = sv1.getAvg();
        double avgSv2 = sv2.getAvg();
        System.out.println(avgSv1);
        System.out.println(avgSv2);

        if(avgSv1 > avgSv2) {
            System.out.println("Điểm " + sv1.name + " cao hơn");
        } else if(avgSv1 == avgSv2) {
            System.out.println("Điểm 2 ông bằng nhau");
        } else {
            System.out.println("Điểm " + sv2.name + " cao hơn");
        }
    }
}
