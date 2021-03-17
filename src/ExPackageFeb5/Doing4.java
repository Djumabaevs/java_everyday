package ExPackageFeb5;

import java.util.Arrays;
import java.util.Stack;

public class Doing4 {
    public static void main(String[] args) {
        int[] array = {99,54,33,21,5,31,0,6};
        iterativeQS(array);
        System.out.println(Arrays.toString(array));
    }
    public static void iterativeQS(int[] numbers){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(numbers.length);

        while(!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if(end - start < 2 ){
                continue;
            }
            int p = start + ((end - start)/2);
            p = partition(numbers,p, start, end);
            stack.push(p +1);
            stack.push(end);
            stack.push(start);
            stack.push(p);
        }
    }
    private static int partition(int[] input, int position, int start, int end){
        int l = start;
        int h = end - 2;
        int piv = input[position];
        swap(input,position,end - 1);
        while(l < h){
            if(input[l] < piv){
                l++;
            } else if (input[h] >= piv){
                h--;
            } else {
                swap(input, l, h);
            }
        }
        int index = h;
        if(input[h] < piv){
            index++;
        }
        swap(input,end - 1, index);
        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
