package Challanges;

import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new ArrayDeque<String>();

        String str;
    }
    public static boolean checkForPalindrome(String text){
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = text.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }
        return true;
    }

    public static boolean checkForPalindromeFirst(String text){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder();
        String lowerCase = text.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverseString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverseString.append(stack.pop());
        }
        return reverseString.toString().equals(stringNoPunctuation.toString());
    }
}
