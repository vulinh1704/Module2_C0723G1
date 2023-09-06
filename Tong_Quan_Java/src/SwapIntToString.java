import java.util.Scanner;

public class SwapIntToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số");

        int number = input.nextInt();
        String result = "";
        int donVi = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;

        if(tram != 0) {
            result = result + getString(tram);
            result = result + " trăm ";
        }

        if(chuc != 0) {
            result = result + getString(chuc);
            result = result + " mươi ";
        }
        result = result + getString(donVi);
        System.out.println(result);
    }

    public static String getString(int number) {
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return "";
        }
    }
}
