import java.util.Scanner;

public class FindLargestSmallestNumber {

 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

  int smallest = arr[0];
  int largetst = arr[0];

  for (int i = 0; i < n; i++) 
  {
    System.out.print("Enter A["+(i)+"]:");
    arr[i]=sc.nextInt();
}

  for (int i = 0; i < arr.length; i++) 
  {
   if (arr[i] > largetst)
   {
    largetst = arr[i];
   }
   else if (arr[i] < smallest)
   {
    smallest = arr[i];
   }
  }

  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 }
}