public class Animal {
    public String name;
    public int age;

    public Animal() {
        this.name = "dog";
        this.age = 20;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void go() {
        System.out.println(this.name + " Đang chạy");
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + this.name + '\'' +
                ", age=" + age +
                '}';
    }

    double method(int x) {
        if(x > 5) {
            return 3;
        } else {
           return 1;
        }
    }
}

class A {
}

class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.go();
        Animal b = new Animal("Cat" , 22);
        b.go();

        // lấy tuổi của mèo và gán vào biến ageCat rồi in ra;
        int ageCat = b.getAge();
        System.out.println(a.age);
        System.out.println(ageCat);
        A c = new A();
    }
}
