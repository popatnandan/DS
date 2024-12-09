import java.util.*;
import java.util.Stack;

public class PrefixEvaluator {

    // Function to evaluate the prefix expression
    public static int evaluatePrefix(String prefix) {
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the prefix expression in reverse order
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            
            // If the character is an operand (number), push it onto the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            } 
            // If the character is an operator
            else {
                // Pop two elements from the stack
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                
                // Perform the operation and push the result back onto the stack
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        // The result will be the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a prefix expression (without spaces): ");
        String prefix = scanner.nextLine();
        
        int result = evaluatePrefix(prefix);
        System.out.println("The result of the prefix expression is: " + result);
    }
}