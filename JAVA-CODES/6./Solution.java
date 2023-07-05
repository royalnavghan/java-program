import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int number;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
