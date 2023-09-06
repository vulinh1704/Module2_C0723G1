import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Demo {
//    public static void main(String[] args) {
////        getNumber(1, 2,"Dân");
//        System.out.println(sum(3,4));
//    }
//
////    public static void getNumber(int a,int b, String c) {
////        System.out.println(a + b + c);
////    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }


//    public static void main(String[] args) {
////        char[] arr = {'a' , 'b', 'c'};
//
////        int[] arr = new int[4]; // int: 0 double: 0.0 String: null
//
//          // size: số lượng phần tử có trong mảng
////        arr[0] = 1;
////        arr[1] = 2;
////        System.out.println(Arrays.toString(arr));
//
////        int[][] arr = new int[4][4];
//
//    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int size = 0;
        size = push(arr, 10, size); // size = 1
        size = push(arr, -5, size); // size = 2
        size = push(arr, 21, size); // size = 3
        size = push(arr, 11, size); // size = 4

        //System.out.println("Vị trí phần tử bạn tìm là: "+ search(arr, -5, size));

        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println("Size: " + size);

        size = delete(arr, 21, size);
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));
        System.out.println("Size: " + size);
    }

    public static int delete(int[] arr, int element, int size) {
        int index = search(arr, element, size);
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    public static int push(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int search(int[] arr, int element, int size) {
        for (int i = 0; i < size; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
