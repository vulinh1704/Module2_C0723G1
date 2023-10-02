package model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] points;

    public Student(int id, String name, double math, double history, double chem) {
        this.id = id;
        this.name = name;
        this.points = new double[]{math, history, chem};
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
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public String getData() {
        return id + "," + name + "," + this.points[0] + ";" + this.points[1] + ";" + this.points[2];
    }
}
