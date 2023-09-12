public class D {
    public int add(int a, String b) {
        return 1;
    }

    public String add(String a, int b) {
        return "";
    }
}
class Main2 {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.add(1, "a"));
    }
}