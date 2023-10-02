package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);
    public static int inputNumber() {
        int number;
        do {
            try {
                number = Integer.parseInt(input.nextLine());

                break;
            } catch (NumberFormatException exception) {
                System.out.println("Sai dinh dang nhap lai dum: ");
            }
        } while (true);
        return number;
    }

    public static String inputString() {
        return input.nextLine();
    }
}
