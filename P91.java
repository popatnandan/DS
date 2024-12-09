import java.util.Scanner;

public class P91 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the arry:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Searching Value");
        int key = sc.nextInt();

        int left = 0, right = n-1, f = 0;

        while (left <= right)                         // Lower condition check rightper
        {
            int mid = (left + right) / 2;

            if (arr[mid] == key)                  // Array User Value Comapre
            {
                f = 1;
                break;
            }
            if (arr[mid] < key)                   // Array value Condition check user scan
            {                                   // Array less than value chack left side
                                                // Array greater than value chack right side
                left = mid + 1;                   // Lower Ending index value cheack
            }
            else
            {
                right = mid - 1;                   // rightper Satring index value cheack
            }
        }

        if (f == 1)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}