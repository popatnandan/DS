import java.util.Scanner;

public class DeleteFromSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " sorted numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to delete: ");
        int numToDelete = scanner.nextInt();

        int i;
        for (i = 0; i < n; i++) {
            if (numbers[i] == numToDelete) {
                break;
            }
        }

        if (i == n) {
            System.out.println("Number not found in the array.");
        } else {
            for (int j = i; j < n - 1; j++) {
                numbers[j] = numbers[j + 1];
            }

            System.out.println("Array after deletion:");
            for (i = 0; i < n - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}
