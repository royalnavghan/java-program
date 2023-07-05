import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int count, number;
        int largest = Integer.MIN_VALUE;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        count = in.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            number = in.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);

        in.close();
    }
}
