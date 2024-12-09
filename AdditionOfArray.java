import java.util.Scanner;

public class AdditionOfArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Matrix Data");
        int a[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix Data");
        int b[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
    

        System.out.println("First Matrix Data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Second Matrix Data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }

        int c[][]=new int[2][2];
        System.out.println("Addition Of Two Matrix=");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
