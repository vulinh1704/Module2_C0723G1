class Address {
    public Address() {
        System.out.println("Constructor");
    }
    public void go() {
         int a = 10;
    }
}
 public class Person {
    public static Address address = new Address();

    static {
        System.out.println("Static Block");
    }

    public static void showPerson() {
        System.out.println("Linh is Handsome");
    }

    public static void main(String[] args) {
        Person.showPerson(); // Non heap memory
    }
}
