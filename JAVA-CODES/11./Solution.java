import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        System.out.println("All substrings of the string:");
        findAllSubstrings(str);

        scanner.close();
    }

    public static void findAllSubstrings(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
