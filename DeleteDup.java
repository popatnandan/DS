// 25. Write a program to delete duplicate numbers from an array.

import java.util.*;

class DeleteDup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        int[] a = new int [n];
        for(int i=0 ; i<n ;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ;i++)
        {
            for(int j=i+1  ; j<n ; j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j ; k < n-1 ; k++)
                    {
                        a[k] = a[k+1];
                    }
                }
            }
        }
        for(int i=0 ; i<n ;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.print(a[i]+" | ");
            }
            else
            {
                System.out.print(a[i]+" | ");
            }
        }
    }
}