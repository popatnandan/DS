import java.util.Scanner;

public class BinSearchRecursion
{
    public static int binarySearch(int arr[], int x)
    {
        return binarySearch(arr, x, 0, arr.length - 1);

    }

    public static int binarySearch(int arr[], int x, int Left, int right)
    {
        if (Left > right) 
        {
            return -1;
        }
        int mid = (Left + right) / 2;

        if (arr[mid] == x)
        {
            return mid;
        }
        if (arr[mid] > x)
        {
            return binarySearch(arr, x, Left, mid - 1);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "  Elements in sorted array:");

        for (int i = 0; i < n; i++)
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter elememt for search: ");
        int x = sc.nextInt();

        boolean f = false;

        // int result = binarySearch(arr, x);
        // if (result == -1)
        //     System.out.println("Element not present in array");
        // else
        //     System.out.println("Element found at index " + result);

        for(int i = 0; i < n; i++)
        {
           if(arr[i]==x)
            {
                System.out.println("Number Is Found at Index:" + i);
                f = true;
                break;
            }
        }
        if(!f)
        {
            System.out.println("Number not found....");
        }
    }

}
