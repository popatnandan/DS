 import java.util.Scanner;

 public class DaysConverter {
 
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter days: ");
        int days = sc.nextInt();
 
        int years = (days / 365);
        int weeks = (days % 365) / 7;
        days  = (days % 365) % 7;
         System.out.println("Years = " + years+",Weeks = " + weeks+",Days  = " + days);
     }
 }