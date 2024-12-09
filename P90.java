//Linear Searching is traserving array each and every element check condition than will be not found it
//And Than Random Value In Array and Search element than after print the data.

import java.util.*;

public class P90 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();

        int[] arr = new int[s];

        for(int i = 0; i < s; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Searching Value");
        int item = sc.nextInt();

        boolean f = false;

        for(int i = 0; i < s; i++)
        {
           if(arr[i]==item)
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
