import java.util.Scanner;
import java.util.Arrays;

public class Repl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("enter number u want to replace");
        int num1 = scanner.nextInt();
        System.out.println("enter new number");
        int num2 = scanner.nextInt();

        for (int i = 0; i < n ; i++) {

            if (numbers[i] == num1) {
                numbers[i] = num2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("new arrayy = a["+numbers[i]+"]");
        }
    }

}
