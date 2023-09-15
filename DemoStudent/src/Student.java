import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double[] points;

    private static int idIncrement = 1;

    public Student(String name, String sex, double[] points) {
        this.id = idIncrement;
        this.name = name;
        this.sex = sex;
        this.points = points;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public double getAvg() {
        double sum = 0;
        for (double point : points) {
            sum += point;
        }
        return sum / 3;
    }

}
