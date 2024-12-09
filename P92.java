import java.util.Scanner;
public class P92 
{
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bubble Sort");
        System.out.println("Enter the number of size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "  Elements of the array:");
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = n; i > 0; i--) 
        {
            for (int j = 0; j < i-1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array Is");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + "|");
        }
    }
}
