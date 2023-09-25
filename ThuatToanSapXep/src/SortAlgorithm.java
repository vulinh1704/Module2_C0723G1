import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
//        bubbleSort();
//        selectionSort();
        insertSort();
        a();

    }


    public static void bubbleSort() {
        int[] numbers = new int[]{3, 1, 5, 4, 6};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort() {
        int[] numbers = new int[]{15, 5, 3, 6, 4, 10};
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertSort() {
        int[] numbers = new int[]{1, 4, 75, 54, 2, 7};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }


    public static void a() {

        int a = 234;
        int b = 192;
        int soDu = a % b;
        while (soDu != 0) {
            a = b;
            b = soDu;
            soDu = a % b;
        }
        System.out.println("Ước chung lớn nhất: " + b);


    }

}
