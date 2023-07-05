import java.util.Scanner;

public class Santhosh {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + celsius);
        scanner.close();
    }
}
