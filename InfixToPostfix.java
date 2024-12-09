// 45. Write a program to convert infix notation to postfix notation using stack.


import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String INFIX = sc.next();

        PostFix(INFIX);
    }

    public static void PostFix(String INFIX){
        Stack<Character> stack = new Stack<>();

        String infix = INFIX;
        infix += ')';
        stack.push('(');

        String POLISH = "";
        int RANK = 0;
        char temp;
        int  i = 0;
        char NEXT = infix.charAt(i);
        while (i <  infix.length()) {
            if (stack.isEmpty()) {
                System.out.println("Invalid String...");
            }

            while (SPF(stack.peek()) > IPF(NEXT)) {
                temp = stack.pop();
                POLISH = POLISH + temp;
                RANK = RANK + rank(temp);

                if (RANK < 1) {
                    System.out.println("Invalid String...");
                }
            }

            if (SPF(stack.peek()) != IPF(NEXT)) {
                stack.push(NEXT);
            }
            else{
                stack.pop();
            }
            i++;
            if (i<infix.length()) {
                NEXT = infix.charAt(i);
            }
        }

        if (!stack.isEmpty() || RANK != 1) {
            System.out.println("Invalid String...");
        }
        else{
            System.out.println("String: "+POLISH);
        }
    }

    public static int SPF(int c){
        int r = 0;
        if (c == '+' || c == '-') {
            r = 2;
        }
        else if(c == '*' || c == '/'){
            r = 4;
        }
        else if(c == '^'){
            r = 5;
        }
        else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= 0 && c <= 9){
            r = 8;
        }
        else if (c == '(') {
            r = 0;
        }
        else{
            r = 9;
        }
        return r;
    }

    public static int IPF(int c){
        int r = 0;
        if (c == '+' || c == '-') {
            r = 1;
        }
        else if(c == '*' || c == '/'){
            r = 3;
        }
        else if(c == '^'){
            r = 6;
        }
        else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= 0 && c <= 9){
            r = 7;
        }
        else if (c == '(') {
            r = 9;
        }
        else if (c == ')') {
            r = 0;
        }
        else{
            r = 9;
        }
        return r;
    }

    public static int rank(int c){
        int r = 0;
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            r = -1;
        }
        else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= 0 && c <= 9){
            r = 1;
        }
        else{
            r = 9;
        }
        return r;
    }
}
