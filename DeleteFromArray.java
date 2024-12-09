import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the location (0 to " + (n - 1) + ") to delete the number: ");
        int location = sc.nextInt();

        if (location < 0 || location >= n) {
            System.out.println("Error: Invalid location.");
        } else {
            for (int i = location; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
