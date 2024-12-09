import java.util.Scanner;

public class AreaOfCricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("Area Of A Circle Is: "+a);
    }
    
}
