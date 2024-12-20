import java.util.Scanner;

public class P97 {

    static int partition(int[] array, int low, int high) 
    {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) 
        {
            if (array[j] <= pivot) 
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    static void quickSort(int[] array, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


