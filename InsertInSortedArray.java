import java.util.Scanner;

public class InsertInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n + 1];

        System.out.println("Enter " + n + " sorted numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter A["+(i)+"]:");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int numToInsert = sc.nextInt();

        int i;
        for (i = n - 1; i >= 0 && numbers[i] > numToInsert; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[i + 1] = numToInsert;

        System.out.println("Array after insertion:");
        for (i = 0; i <= n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
