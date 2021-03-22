import java.util.Stack;

public class NumberOne {

    public static int calculate(String s) {

        int operand = 0;
        int n = 0;
        Stack<Object> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                // Forming the operand - in reverse order.
                operand = (int) Math.pow(10, n) * (int) (ch - '0') + operand;
                n += 1;

            } else if (ch != ' ') {
                if (n != 0) {

                    // Save the operand on the stack
                    // As we encounter some non-digit.
                    stack.push(operand);
                    n = 0;
                    operand = 0;

                }
                if (ch == '(') {

                    int res = evaluateExpress(stack);
                    stack.pop();

                    // Append the evaluated result to the stack.
                    // This result could be of a sub-expression within the parenthesis.
                    stack.push(res);

                } else {
                    // For other non-digits just push onto the stack.
                    stack.push(ch);
                }
            }
        }

        //Push the last operand to stack, if any.
        if (n != 0) {
            stack.push(operand);
        }

        // Evaluate any left overs in the stack.
        return evaluateExpress(stack);
    }


    public static int evaluateExpress(Stack<Object> stack) {

        int res = 0;
        if(!stack.isEmpty()) {
            res = (int)stack.pop();
        }
        while ((!stack.isEmpty()) && ((char)stack.peek() == ')')) {
            char sign = (char)stack.pop();
            if(sign == '+') {
                res += (int)stack.pop();
            } else {
                res -= (int)stack.pop();
            }
        }
        return res;
    }
}
