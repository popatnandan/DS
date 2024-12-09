import java.util.Scanner;

public class InsertAtLocationInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n + 1];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter A["+(i)+"]:");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int numToInsert = sc.nextInt();

        System.out.print("Enter the location (0 to " + n + ") to insert the number: ");
        int location = sc.nextInt();

        for (int i = n; i > location; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[location] = numToInsert;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
