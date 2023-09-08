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

class Main5 {
    public static void main(String[] args) {
        // Nhập vào một mảng và thêm các phần tử vào sau đó đảo ngược các phần tử.
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        int size = 0;

        while (size < arr.length) { //
            System.out.println("Nhâp vào phần tử thứ: " + size); // 1
            int element = input.nextInt(); // 5 7
            arr[size] = element; // arr[0] = 5; arr[1] = 7
            size++; // size = 1
        }
        System.out.println("Mảng trước khi đảo: ");
        System.out.println(Arrays.toString(arr));

        // arr [1,4,6,7,9]
        int[] newArr = new int[length];
        int newSize = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[newSize] = arr[i]; // newSize = 0 => newArr[0] = 9
            newSize++;
        }

        System.out.println("Mảng sau khi đảo: ");
        System.out.println(Arrays.toString(newArr));
    }
}

class Main6 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7};
        for (int y: arr) {
            System.out.println(y);
        }
        String[] a = {"Jonh", "Mary", "Caly", "Tomy"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    static int m(int ...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
}



