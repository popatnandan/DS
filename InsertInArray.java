import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n + 1];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int numToInsert = scanner.nextInt();

        System.out.print("Enter the location (0 to " + n + ") to insert the number: ");
        int location = scanner.nextInt();

        for (int i = n; i > location; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[location] = numToInsert;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
