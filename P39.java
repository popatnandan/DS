/* 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a
       program to solve the above problem.*/
import java.util.*;

class P39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String n = sc.next();
        char[] arr = n.toCharArray();   
        int cIndex = 0;

        Stack s = new Stack(n.length());

        for(int i=0 ; i<n.length() ; i++)
        {
            if(arr[i] == 'c')
            {
                cIndex=i+1;
                break;
            }
            else
                s.PUSH(arr[i]);
        }
        for(int i = cIndex ; i < n.length() ; i++)
        {
            if(arr[i]!=s.POP())
            {
                System.out.println("Invalid String");
                break;
            }
        }
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
}