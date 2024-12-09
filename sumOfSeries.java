// JAVA Code For Sum of the series
import java.util.*;

public class sumOfSeries {
	
	static int sumOfSeries(int n)
	{
		int sum = 0;
		for (int i = 1 ; i <= n ; i++)
			for (int j = 1 ; j <= i ; j++)
				sum += j;
		return sum;
	}
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To You Want To Print Series:");
		int n = sc.nextInt();
		System.out.println(sumOfSeries(n)); 
		
	}
}

