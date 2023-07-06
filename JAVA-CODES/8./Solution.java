import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str1, str2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        str2 = scanner.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean checkAnagram(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
