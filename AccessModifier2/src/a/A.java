package a;

public class A {
    private String name;
    private int age;
    protected int cccd;
    // Phạm vi truy cập của protected là trong cùng 1 package hoặc có thể ngoài package nhưng trong quan hệ kế thừa

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void go() {
        System.out.println("Dang di");
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
}
