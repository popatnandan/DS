
import java.util.Scanner;
import java.util.Stack;

public class P_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix Notation:");
        String INFIX=sc.next();

        Prefix(INFIX);
    }
    public static void Prefix(String INFIX){
        Stack<Character> stack = new Stack<>();
        String infix = INFIX;
        infix +=')';
        stack.push('(');

        String POLISH = "";
        int RANK = 0;
        char temp;
        int  i = 0;
        char NEXT = infix.charAt(i);
        while (i <  infix.length()) 
        {
            if (stack.isEmpty()) 
            {
                System.out.println("Invalid String...");
            }
            while (SPF(stack.peek()) > IPF(NEXT))
            {
                temp = stack.pop();
                POLISH = temp + POLISH;
                RANK = RANK + rank(temp);   
            }


        }
    


        public static int SPF(int c){
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
                        r = 2;
                    }
                    else if(c == '*' || c == '/'){
                        r = 4;
                    }
                    else if(c == '^'){
                        r = 5;
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
