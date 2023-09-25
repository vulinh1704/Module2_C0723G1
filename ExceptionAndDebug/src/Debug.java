
public class Debug {
    public static void go(int c) {
        c++;
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a = 10;
        go(a);
        for (int i = 0; i < 20; i++) {
            a++;
            go(i);
        }
        System.out.println(a);
        System.out.println("Linh");
    }
}
