import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        boolean hasUniqueChars = hasUniqueCharacters(str);

        if (hasUniqueChars) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }

        scanner.close();
    }

    public static boolean hasUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (uniqueChars.contains(ch)) {
                return false;
            }
            uniqueChars.add(ch);
        }

        return true;
    }
}
