/* 41. Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now
       Chef wants to know if the given string is balanced or not. If is balanced then
       print 1, otherwise print 0.
        A balanced parenthesis string is defined as follows:
         The empty string is balanced
         If P is balanced then (P), {P}, [P] is also balanced
         if P and Q are balanced PQ is also balanced
         "([])", "({})[()]" are balanced parenthesis strings
         "([{]})", "())" are not balanced.
        Input: The first line of the input contains a single integer T denoting the
         number of test cases. The description of T test cases follows. The first
         and only line of each test case contains a single string
        Output: For each test case, print a single line containing the answer.
        Example of Input & Output
Input:
 Enter No of Test Cases: 4
 ()
 ([)]
 ([{}()])[{}]
 [{{}]

Output:
 1
 0
 1
 0 */


import java.util.*;

class P41
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String = ");
        String n = sc.next();
        char[] arr =  n.toCharArray();
        boolean valid = true;

        Stack s = new Stack(n.length());

        for(char ch : arr)
        {
            System.out.println(ch);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                s.PUSH(ch);
            }
            else if(ch == ')' && s.TOPVALUE() == '(')
            {
                s.POP();
            }
            else if(ch == '}' && s.TOPVALUE() == '{')
            {
                s.POP();
            }
            else if(ch == ']' && s.TOPVALUE() == '[')
            {
                s.POP();
            }
            else
            {
                valid = false;
                System.out.println("0");
                break;
            }
        }
        if(valid)
            System.out.println("1");
    }
}
class Stack{
    
    private char[] s;
    private int top;

    public Stack (int n){
        s = new char[n];
        top = -1;
    }

    void PUSH(char ch)
    {
        if(top == s.length-1)
        {
            System.out.println("Stack is Overflow");
        }
        top++;
        s[top] = ch;
    }
    char POP()
    {
        Scanner sc = new Scanner(System.in);
        if(top < 0)
        {
            System.out.println("Stack is underflow");
        }

        top--;
        return s[top+1];
    }
    char TOPVALUE()
    {
        return s[top];
    }
}