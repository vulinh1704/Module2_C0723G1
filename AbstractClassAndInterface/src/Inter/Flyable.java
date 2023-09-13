package Inter;

public interface Flyable {
    static final int A = 10; //Mặc định thuộc tính trong interface là static final

    public abstract String fly();
    // Các phương thức ở trong interface là abstract và public

    static void go() {
        System.out.println("Hello");
    }

    default void run() {
        System.out.println("Run now");
    }

    // Từ Java 8: có thể khai báo cacs phương thức có triển khai để với static hoặc default
}
