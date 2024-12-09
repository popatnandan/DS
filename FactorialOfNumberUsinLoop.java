import java.util.Scanner;

public class FactorialOfNumberUsinLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=n; i++)
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial Of Given Nuber Is: "+factorial);
    }
}
