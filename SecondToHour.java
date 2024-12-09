import java.util.*;

public class SecondToHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        int s = seconds;
        int h = s / 3600;
        s=s%3600;
        int m = h % 60;
        s = s%60;

        System.out.print(h + "Hours" + m + "Minute" + s+"Seconds");
    }
}
