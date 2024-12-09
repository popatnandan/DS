
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int arr[], int x) 
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];


        System.out.println("Enter " + n + "  Elements :");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int x = sc.nextInt();
        int result = linearSearch(arr, x);
        if (result == -1)
        {
            System.out.println("Element not present in array");
        }
        else
        {
            System.out.println("Element found at index " + result);
        }
    }

    
}
