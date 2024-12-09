import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter " + n1 + " numbers for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter " + n2 + " numbers for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = array2[i];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
