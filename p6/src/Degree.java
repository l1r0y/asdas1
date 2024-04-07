import java.util.Scanner;

public class Degree {
    public static double power(double a, int n) {
        // Base case: if n is 0, return 1
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the power: ");
        int n = scanner.nextInt();

        double result = power(a, n);
        System.out.println(result);

        scanner.close();
    }
}