package LeetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static int findLongestSubstring(String s){

     int n = s.length();
     int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n ; j++) {
                if(allUnique(s,i,j)) ans = Math.max(ans, j - i);

            }
        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    //using sliding window to improve speed from o(n3) to o(n) or even o(1)

    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while(i < n && j < n){
            // try to extend the range
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    //optimized window sliding
    public static int lengthOfLongestSubstring2(String s){
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0, j = 0; j < n; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i  + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String text = "Hello! With every second, I am moving to success!!!";
        System.out.println( findLongestSubstring(text));
        System.out.println( lengthOfLongestSubstring(text));
        System.out.println( lengthOfLongestSubstring2(text));
    }
}
