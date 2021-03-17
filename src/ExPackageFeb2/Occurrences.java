package ExPackageFeb2;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Occurrences {
    private Map<Character, Integer> getOccurrences(String text) {
        text = text.replaceAll("\\s", "");
        char[] charArray = text.toCharArray();
        int totalCount = charArray.length;
        System.out.println("Total number of characters: " + totalCount);

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (char character : charArray) {
                if (text.charAt(i) == character) {
                    count++;
                }
                charCount.put(text.charAt(i), count);
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        Occurrences occurrences = new Occurrences();
        Map<Character,Integer> charCount = occurrences.getOccurrences(text);
        Set<Character> allKeys = charCount.keySet();
        for (char key : allKeys){
            System.out.print(key + " : " + charCount.get(key));
            System.out.print(" ");
        }
    }
}