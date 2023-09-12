public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //this(name); // Sử dụng để gọi đến constructor tương ứng.
    public Animal() {
        System.out.println("Constructor Empty");
    }

    public Animal(String name) {
        this.name = name;
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

    public void go() {
        System.out.println("Động vật  đang đi");
    }

    public boolean eat(String food) {
        System.out.println("Động vật ăn " + food);
        return true;
    }
}
