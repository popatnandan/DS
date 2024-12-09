//Heap Sort 
import java.util.*;
public class P98 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("|");
            arr[i] = sc.nextInt();
        }
        HeapSort hsort = new HeapSort();
		hsort.Heapsort(arr);
        System.out.println("Sorted Array Is");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + "|");
        }
    } 
}
class HeapSort
{
    public void Heapsort(int arr[])
	{
		int n = arr.length;
		for (int i=n/2-1;i>=0;i--)
        {
		    heapify(arr,n,i);
        }
		for (int i=n-1;i>=0;i--) 
        {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}

    void heapify(int arr[],int n,int i)
	{
		int maxindex=i;
		int leftchild=2*i+1;
		int rightchild=2*i+2; 

		if (leftchild<n && arr[leftchild]>arr[maxindex])
        {
			maxindex=leftchild;
        }

		if (rightchild<n && arr[rightchild]>arr[maxindex])
        {
			maxindex=rightchild;
        }
		
		if (i != maxindex) 
        {
			int temp=arr[i];
			arr[i]=arr[maxindex];
			arr[maxindex]=temp;
			heapify(arr,n,maxindex);
		}
	}
}
