import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Stack = ");
        int n = sc.nextInt();

        Stack s = new Stack(n);
        boolean temp = true;

    while(temp)
        {
            System.out.println("Press 1 for PUSH");
            System.out.println("Press 2 for POP");
            System.out.println("Press 3 for PEEP");
            System.out.println("Press 4 for CHANGE");
            System.out.println("Press 5 for DISPLAY");
            System.out.println("Press 6 for EXIT");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    s.PUSH();
                    break;
                case 2:
                    s.POP();
                    break;
                case 3:
                    s.PEEP();
                    break;
                case 4:
                    s.CHANGE();
                    break;
                case 5:
                    s.DISPLAY();
                    break;
                case 6:
                    temp = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
        }
    }
}
}
class Stack{
    
    private int[] s;
    private int top;

    public Stack (int n){
        s = new int[n];
        top = -1;
    }

    void PUSH()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("New Values : ");
        int x = sc.nextInt();
        if(top == s.length-1)
        {
            System.out.println("Stack is Overflow");
            DISPLAY();
            return;
        }
        top++;
        s[top] = x;
        DISPLAY();
    }
    void POP()
    {
        Scanner sc = new Scanner(System.in);
        if(top <= 0)
        {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Removed element of stack is : "+s[top]);
        top--;
        DISPLAY();
    }
    void PEEP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Position of Values : ");
        int i = sc.nextInt();
        if((top-i+1) <= 0)
        {
            System.out.println("Stack is Overflow");
            DISPLAY();
            return;
        }
        System.out.println("Ith element of stack is : "+s[top-i+1]);
    }
    void CHANGE()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Position of New Values : ");
        int i = sc.nextInt();
        System.out.print("New Values : ");
        int x = sc.nextInt();
        if((top-i+1) <= 0)
        {
            System.out.println("Stack is Underflow");
            return;
        }
        s[top-i+1] = x;
        DISPLAY();
    }
    void DISPLAY()
    {
        System.out.println("Values Stack:");
        for(int i = 0 ; i <= top ; i++)
        {
            System.out.print(s[i]+" | ");
        }
        System.out.println("");
    }
}

