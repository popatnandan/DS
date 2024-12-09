import java.util.Scanner;
public class SumOfMToNNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Range Between M to N: ");
        System.out.print("Enter M: ");
        int m=sc.nextInt();
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("Your SUM Of "+m+" TO "+n+" Is:"+sum);
    }    
}
