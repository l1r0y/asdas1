import java.util.Scanner;

public class DigitCheck {
    public static boolean allDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: ");
        String s = scanner.nextLine();

        System.out.println((allDigits(s) ? "Yes" : "No"));

        scanner.close();
    }
}