import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String original, reversed = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        original = scanner.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
