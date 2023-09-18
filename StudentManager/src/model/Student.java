package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private static int idIncrement = 1;

    public Student(String name, int age, String address) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        this.address = address;
        idIncrement++;
    }

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        Student.idIncrement = idIncrement;
    }

    @Override
    public String toString() {
        return "Học sinh có tên là: " + name + " | tuổi: " + age + " | Địa chỉ " + address;
    }
}
