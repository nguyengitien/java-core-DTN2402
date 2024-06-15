package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên.");
                System.out.println("Nhap lại: ");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if (Integer.parseInt(input) > 0) {
                    return Integer.parseInt(input);
                } else {
                    System.err.println("Yêu cầu nhập vào số nguyên dương.");
                    System.err.println("Nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên dương.");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên.");
                System.out.println("Nhap lại: ");
            }
        }
    }

    public static float inputDouble() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.doubleToLongBits(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên.");
                System.out.println("Nhap lại: ");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        // yêu cầu chức @
        String input = scanner.nextLine();
        if (input.contains("@")) {
            return input;
        } else {
            System.out.println("Yêu cầu email chứa kí tự @.");
            System.out.println("Nhập lại: ");
        }
    }

    public static String inputPassword() {
        //yêu cầu 6-12 kí tự, ít nhất 1 kí ự vết hoa
        String input = scanner.nextLine();
        int length = input.length();
        if (length < 6 || length > 12) {
            System.out.println("Yêu cầu password từ 6 đến 12 kí tu.");
            System.out.println("Nhập lại");
        } else {
            for (int i = 0; i < length; i++) {
                char c = input.charAt(i);
                if (Character.isUpperCase(c)) {
                    return input;
                }
            }
            System.out.println("Yêu cầu password ít nhất 1 kí tự viê hoa.");
            System.out.println("Nhập lại");
        }
    }

    public static String inputFullname(){
        //yêu cầu chỉ chứa chữ cái (không dặc biet, không số)
    }
}
