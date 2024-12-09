import java.util.*;

public class P60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int data = sc.nextInt();
        LinkedList l1 = new LinkedList();

        while (true) {
            int n = sc.nextInt();
            if (n == 1) {

            }

        }

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node top;

    public void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        System.out.println(data);
    }

    void pop() {
        top = top.next;
    }

    public void dispaly() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();

    }
}
