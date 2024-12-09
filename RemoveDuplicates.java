import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];


        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
     }
     for (int i = 0; i < n-1; i++) {
        for (int j = 1; j < n; j++) {
            if (numbers[i]==numbers[j]){
                System.out.println("duplicate");
            return;}      
     }

        
 }
System.out.println("not duplicate");
       
    }
}
