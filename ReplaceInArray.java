import java.util.*;
public class ReplaceInArray 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter A["+(i)+"]:");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the first number to replace: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number to replace with: ");
        int num2 = sc.nextInt();

    
    int indexToReplace = -1;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == num1) 
            {
                arr[i] = num2;
                indexToReplace = i;
                break;
            }
        }

        if (indexToReplace == -1) 
        {
            System.out.println(num1 + " was not found in the array.");
        } else {
            System.out.println("Index of replaced number: " + indexToReplace);
        }

        // Print the final array
        System.out.println("Final array:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



