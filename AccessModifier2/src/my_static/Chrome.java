package my_static;

public class Chrome {
    static public int count;
    public static final String nameChrome;
    private String name;

    static {
        nameChrome = "Chrome";
    }

    public Chrome(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static public void getDomain() {
        System.out.println("Domain is https//");
    }
    // Phương thức static không thể truy cập các thuộc tính hoặc phương nonstatic
    // Phương thức nonstatic thì có thể truy cập tất cả.

    static public void getExtentions() {
        System.out.println("Cac exten....");
    }
}

class Main {
    public static void main(String[] args) {
        Chrome web = new Chrome("CodeGym");
        System.out.println(web.getName()); // CodeGym

        Chrome web1 = new Chrome("James");
        System.out.println(web1.getName()); // James

        System.out.println(Chrome.count); // Truy cap thuoc tinh cua lop
        Chrome.getDomain(); // Truy cap phuong thuc cua lop
    }
}