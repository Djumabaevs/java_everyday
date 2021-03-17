package Lists2;

import java.util.Stack;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long i){
        top++;
        stackArray[top] = i;
    }
    public long pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull() {
        return (maxSize - 1 == top);
    }

}

class Test{
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(30);
        stack.push(20);

        while(!stack.isEmpty()){
            long value = stack.pop();
            System.out.println(value);
        }
    }

    public static String reverseString(String str){
        int stackSize = str.length();
        MyStack stack = new MyStack(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }
        String result = "";
        while(!stack.isEmpty()){
            char ch = (char) stack.pop();
            result = result + ch;
        }
        return result;
    }
}
