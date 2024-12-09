import java.util.Scanner;

public class P93 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Array Is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "|");
        }
    }
}