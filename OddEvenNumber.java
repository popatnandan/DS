import java.util.*;
public class OddEvenNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Number: ");
        int a =sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number Is Even");
        }
        else
        {
            System.out.println("Number Is Odd");
        }
    }
}