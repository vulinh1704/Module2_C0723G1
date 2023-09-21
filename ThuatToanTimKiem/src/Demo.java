import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(search(10));
        System.out.println(searchBinary(-3));
    }

    public static int search(int number) {
        int[] myArr = new int[]{7, 8, 5, 2, -2, 1, 10};
        for (int i = 0; i < myArr.length; i++) {
            if (number == myArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int searchBinary(int K) {
        int[] A = new int[]{1, 3, 4, 6, 7, 9, 10};
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(A[mid] == K) {
                return mid;
            } else if(A[mid] < K) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public void calculator() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 10;
        int n = input.nextInt();

        for (int i = 0; i < n; i++) { // On
            a++; // O1 => On
        }

        for (int i = 1; i < n - 1; i++) { // O(n)
            a--; // O1 => O(n)
        }

        // O(n)

        for (int i = 0; i < n; i++) { // n
            for (int j = 0; j < n; j++) { // n
                b++;
            }
        }
        // O(n^2)


    }
}
