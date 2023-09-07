import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public int a = 10; // Biến toàn cục
    public static int b = 22; // Biến static

    public static void main(String[] args) {
        int a = 1; // Biến cục bộ
        int b = a;
        b = 2;
        System.out.println(a); // a = 1
        System.out.println(b); // b = 2

        Person p1 = new Person("Ling", 22);
        Person p2 = new Person("Pink", 22);
        Person p3 = p1;
        p3.name = "Pink";
        System.out.println(p3); // Person {name: "Pink", age: 22}
        System.out.println(p1); // Person {name: "Pink", age: 22}
        System.out.println(p1 == p2); // false
        System.out.println(p1 == p3); // true
    }
}

class Main2 {
    public static void main(String[] args) {
//        int a = 1;
//        changePri(a);
//        System.out.println(a); // 1

        Person p2 = new Person("Pink", 22);
        changeObj(p2);
        System.out.println(p2); // Person {name: "Hồng", age: 22}
    }

    public static void changePri(int a) {
        a = 10;
    }

    public static void changeObj(Person p) {
        // tự động gán p = p2
        p.name = "Hồng";
    }
}

class Main3 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12}; // length = 3; size = 3;

        int[] arr2 = new int[4]; // length = 4; size = 0;
//        Khi khai báo bằng từ khóa new nó sẽ tạo một mảng có độ dài được chỉ định và trong mảng chứa các giá trị mặc đinh
//        int: 0, double: 0.0, String: null, boolean: false;

        arr2[0] = 10;
        arr2[3] = 20;
        System.out.println(Arrays.toString(arr2));
    }
}

class Main4 {

//    {
//        // Yêu cầu nhập vào độ dài mảng và nhập các phần tử sau đó in ra mảng đó.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ dài mảng: ");
//        int length = input.nextInt();
//        int[] arr = new int[length];
//        int size = 0;
//        while (size != length) {
//            System.out.println("Nhập phần tử thứ " + size); // 1
//            int element = input.nextInt(); // 3
//            arr[size] = element; // a[1] = 3  [-2, 3]
//            size++;  // 1
//        }
//        System.out.println(Arrays.toString(arr));
//    }


    public static void main(String[] args) {
        int[] arr = new int[7];
        int size = 0;
        size = addElement(arr, -3, size); // 1
        size = addElement(arr, 99, size);
        size = addElement(arr, 69, size);
        size = addElement(arr, -5, size);
        size = addElement(arr, -7, size);

        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println("Size mảng là: " + size);
        //System.out.println("Vị trí cả phần tử 99 là: " + searchByElement(arr, 99, size));

        size = delete(arr, 69, size);
        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println("Size mảng là: " + size);
    }

    public static int delete(int[] arr, int element, int size) {
        int index = searchByElement(arr, element, size);
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    public static int addElement(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int searchByElement(int[] arr, int elementSearch, int size) {
        for (int i = 0; i < size; i++) {
            if(elementSearch == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}



