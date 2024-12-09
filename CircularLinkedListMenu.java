import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    // Insert node at the First
    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
    }

    // Display all nodes
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        } 
    }

    // Delete the First node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    // Insert node at the Last
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete the last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    // Delete node at specified position
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("Position out of range.");
            return;
        }
        temp.next = temp.next.next;
    }
}

public class CircularLinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        while (true) {
            System.out.println("\nCircular Linked List Menu:");
            System.out.println("1. Insert a node at the First");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the First node");
            System.out.println("4. Insert a node at the Last");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node at a specified position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the First: ");
                    int dataFirst = scanner.nextInt();
                    cll.insertFirst(dataFirst);
                    break;

                case 2:
                    cll.display();
                    break;

                case 3:
                    cll.deleteFirst();
                    break;

                case 4:
                    System.out.print("Enter data to insert at the Last: ");
                    int dataLast = scanner.nextInt();
                    cll.insertLast(dataLast);
                    break;

                case 5:
                    cll.deleteLast();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    cll.deleteAtPosition(position);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
