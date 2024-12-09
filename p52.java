import java.util.*;

public class p52 {

    public static void main(String[] args) {
        int d, l;
        boolean temp = true;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        while (temp) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue ");
            System.out.println("3. Insert at First:");
            System.out.println("4. Delete at Rear:");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choise:");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    q.Enqueue();
                    break;
                case 2:
                    q.Dequeue();
                    break;

                case 3:
                    q.Deinsert_f();
                    break;

                case 4:
                    q.DeDelete_r();
                    break;
                case 5:
                    q.Display();
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

class Queue {
    int r = -1, f = -1;
    int s;
    int[] q;
    Scanner sc = new Scanner(System.in);

    Queue() {
        System.out.println("Enter Queue Size");
        s = sc.nextInt();
        q = new int[s];
    }

    void Enqueue() {
        if (r >= q.length -1) {
            System.out.println("Queue is Over Flow");
        } else {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                q[r] = data;
            } else {
                r = r + 1;
                q[r] = data;
            }
        }

    }

    void Dequeue() {

        if (f == -1 && r == -1) {
            System.out.println("Queue is Underflow");
        } else {
            if (f == r) {
                f = -1;
                r = -1;
            }
        }
        System.out.println("Dequeue value is : " + q[f]);
        f = f + 1;

    }

    void Display() {
        if (f == -1 && r  == -1) 
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("items in Queue is : ");
        for (int i = f; i <= q.length; i++) 
        {
            System.out.print("|"+q[i]+"|");
        }
        }
    }

    void Deinsert_f() {
        if (f == 0) {
            System.out.println("Queue is OvereFLow");
        } else {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            if (f == -1) {
                f = 0;
                r = 0;
                q[r] = data;

            } else {
                f = f - 1;
                q[f] = data;

            }
        }
    }

    void DeDelete_r() {
        if (r == -1) {
            System.out.println("Queue is UnderFLow");
        }
        System.out.println("Delete value of r=" + q[r]);
        if (r == f) {
            r = -1;
            f = -1;
        } else {
            r = r - 1;
        }

    }
}