import java.util.Scanner;

public class P36 {
     static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        char scale = scanner.next().toUpperCase().charAt(0);

        if (scale == 'C') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else if (scale == 'F') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
