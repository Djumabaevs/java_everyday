package ExPackageFeb2;

import java.util.Scanner;

public class Occurrences2 {
    static final int MAX_CHAR = 256;
    static void getOccurrences(String text){
        int[] count = new int[MAX_CHAR];
        int length = text.length();
        for (int i = 0; i < length; i++)
            count[text.charAt(i)]++;

            char[] chars = new char[text.length()];
            for (int i = 0; i < length; i++) {
                chars[i] = text.charAt(i);
                int find = 0;
                for (int j = 0; j <= i ; j++) {
                    if(text.charAt(i) == chars[j])
                        find++;

                }
                if(find == 1)
                    System.out.println(text.charAt(i) + " " + count[text.charAt(i)]);
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "geeksforgeeks";
        getOccurrences(text);
    }
}
