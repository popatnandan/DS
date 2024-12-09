import java.util.Scanner;

public class FectorsOfNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int f = sc.nextInt();
        for(int i=1;i<=f;i++)
        {
            if(f%i==0)
            {
                System.out.println("Fectors Of NUmber "+f+ " is: "
                +i);
            }
        }
    }
}
