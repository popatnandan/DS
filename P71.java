import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P71 {
    Node head;

    public Node createNode(int data) {
        return new Node(data);
    }

    public void insertAtFront(int data) {
        Node newNode = createNode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        int count = 1;
        while (count < position - 1) {
            temp = temp.next;
            count++;
        }
        Node nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;
        if (position == 1) {
            head = temp.next;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = createNode(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        P71 circularLinkedList = new P71();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert at front");
            System.out.println("2. Delete at position");
            System.out.println("3. Insert at end");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert: ");
                    int data = scanner.nextInt();
                    circularLinkedList.insertAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter the position to delete: ");
                    int position = scanner.nextInt();
                    circularLinkedList.deleteAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter the data to insert: ");
                    data = scanner.nextInt();
                    circularLinkedList.insertAtEnd(data);
                    break;
                case 4:
                    circularLinkedList.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}