import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*
       int a = 10; // integer: số nguyên
        a = 1;
         */

         /*
        int a;
        a = 10;
        System.out.println(a);

         int a, b, c;
         a = 10;
         b = 1;

        int a = 10, b = 2, c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // main + tab : Tạo main
        // sout + tab: in ra màn hình console
          */


        /*
        int: số nguyên
        double: số thập phân
        String: chuỗi
        boolean: logic (true or false)
        char: Ký tự

        int a = 10;
        double c = 4.6;
        String d = "Linh is handsome";
        char e = 'r';
        boolean isAbc = true;

        final double PI = 3.14; // final: Là từ khóa giúp khai báo biến là hằng số
         */



        /*
        int a = 10;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        Toán tử:
        - Toán học: +, - , *, /, %, ++, --
        - So sánh: >, <, >=, <=, !=, ==
        - Toán tử logic: &&, ||, !
            int diem = 95;
            System.out.println(diem >= 90 && diem <= 100);
            System.out.println(diem < 100 || diem > 0);
            System.out.println(!true);
        - Gán: =, +=, -=, *=, /=, %=
              a += 5; // a = a + 5;
              int a = 10;
              a %= 15; // a = 10 % 15;
              System.out.println(a);
         */

        // Câu lệnh điều kiện: if và switch-case
        /*
        if
        if-else


      if(diem > 90) {
           System.out.println("Học sinh giỏi");
      } else { // diem <= 90
          System.out.println("Học sinh dốt");
      }

        if(diem > 90) {
            System.out.println("Học sinh giỏi");
        }

        if(diem <= 90) {
            System.out.println("Học sinh dốt");
        }

        if-else if

        // Điểm thuộc 90 đến 100 in ra giỏi, 70 - 89 in khá, dưới thì in dốt
        if(diem >= 90 && diem <= 100) {
            System.out.println("Giỏi");
        } else if (diem >= 70 && diem <= 89) {
            System.out.println("Khá");
        } else {
            System.out.println("Dốt");
        }

        if lồng

         int diem = 86;


        if(diem >= 90 && diem <= 100) {
            System.out.println("Giỏi");
        }

        if(diem >= 90) {
           if(diem <= 100) {
               System.out.println("Giỏi");
           }
        }


        // Cho 1 số chạy từ 1 - 4 => In ra chữ của số đó
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                 break;
            case 4:
                System.out.println("Bốn");
                break;
            default:
                System.out.println("Không có số này");
                break;
        }

         */

        /*

        Scanner input = new Scanner(System.in);
        // Scanner: là 1 lớp để tương tác dữ liệu, System.in: dữ liệu từ bàn phím

        System.out.println("Nhập số: ");
        int a = input.nextInt();
        double a = input.nextDouble();
        String a = input.nextLine(); // nhập chuỗi
        System.out.println("Số vừa nhập là: " + a);
         */

//        Scanner inputNumber = new Scanner(System.in);
//        Scanner inputString = new Scanner(System.in);
//
//        System.out.println("Nhập tuổi: ");
//
//        double f = Math.sqrt(5.6);
//
//
//        int age = inputNumber.nextInt(); //"/n"
//
//        System.out.println("Nhập tên: ");
//        String name = inputString.nextLine(); // ""
//        System.out.println("Tên bạn là : " + name + " | Tuổi bạn là: " + age);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập a");
//        int a = input.nextInt();
//        input.nextLine();
//        System.out.println("Nhập b");
//        String b = input.nextLine();
//        float f = 5.6f;

//        System.out.println(false & true);
//        System.out.println(true | false);


        if(5 < 4) {
            System.out.println("Linh");
        } else {
            System.out.println("Hồng");
        }


    }
}
