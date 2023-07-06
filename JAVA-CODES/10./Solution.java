import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        Map<Character, Integer> charCountMap = findDuplicateCharacters(str);

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        scanner.close();
    }

    public static Map<Character, Integer> findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
