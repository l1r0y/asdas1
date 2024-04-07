import java.util.Scanner;

public class MinimumElementFinderRecursive {

    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int minRest = findMinimum(arr, n - 1);
        return Math.min(minRest, arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int minimum = findMinimum(array, n);
        System.out.println("Minimum element: " + minimum);

        scanner.close();
    }
}