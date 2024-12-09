import java.util.Scanner;
class P99 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int gap = n/2; gap >=1; gap=gap/2)
        {
            for (int j = gap; j < n; j++)
            {
                for (int i = j-gap; i >= 0; i=i-gap)
                {
                    if (a[i+gap] > a[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp;
                        temp=a[i+gap];
                        a[i+gap]=a[i];
                        a[i]=temp;
                    }
                }
            }
        }
        System.out.print("Sorted array --> ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
