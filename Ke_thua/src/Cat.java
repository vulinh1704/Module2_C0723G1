public class Cat extends Animal {
    private String color;
    private String name;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        this.name = "Ning";
    }

    //super() Gọi đến constructor có tham số tương ứng của lớp cha.

    public void bark() {
        System.out.println(super.name + "kêu meo meo");
    }

    public void bark2() {
        System.out.println(this.name + " kêu go go..");
    }

    @Override
    public void go() {
        System.out.println("Mèo đang đi nhé");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Mèo con đang ăn " + food);
        return false;
    }

    /*
    Ghi đè phương thức:
    thực hiện định nghĩa lại phương cùng tên, cùng kiểu dữ liệu trả về
    cùng tham số truyền vào (kiểu dữ liệu và số lượng tham số)

    - Xảy ra trong mối quan hệ kế thừa.
     */
}
