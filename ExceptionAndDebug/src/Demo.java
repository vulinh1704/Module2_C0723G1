import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo {

    public static void write() throws IOException {
        FileWriter fileWriter = new FileWriter("abc");
    }

    public static void showError() throws Exception,ArithmeticException, NullPointerException {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception {
      //  throw new Exception("Lỗi tự tạo");
        //showError();
//        int a = 10;
//        try {
//            int b = a / 0;
//            System.out.println(b);
//        } finally {
//            System.out.println("Finally");
//        }
//        System.out.println("Linh is Handsome");

        Scanner input = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("Menu");
//            System.out.println("Nhập lựa chọn");
//            try {
//                choice = input.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Yêu cầu nhập số, nhập lại");
//                input.nextLine();
//                choice = -1;
//            }
//        } while (choice != 0);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("Nhập lựa chọn");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Yêu cầu nhập số, nhập lại");
                choice = -1;
            }
        } while (choice != 0);
    }
}
