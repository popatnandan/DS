import java.util.Scanner;

public class P95 {

    static int getMax(int[] array) 
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
                max = array[i];
            }
        }
        return max;
    }
    static void countingSort(int[] array, int exp) 
    {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        for (int i = 0; i < 10; i++) 
        {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) 
        {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) 
        {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) 
        {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    static void radixSort(int[] array) 
    {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) 
        {
            countingSort(array, exp);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }

        radixSort(array);

        System.out.println("Sorted array:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
    }
}
