import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingklyLinkedList {
         Node first;

    // Insert a node at the front of the linked list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        System.out.println("Node inserted at front: " + data);
    }

    // Display all nodes
    public void display() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = first;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Delete the first node of the linked list
    public void deleteFirst() {
        if (first == null) {
            System.out.println("List is empty. No node to delete.");
            return;
        }
        System.out.println("Node deleted from front: " + first.data);
        first = first.next;
    }

    // Insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            System.out.println("Node inserted at end: " + data);
            return;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Node inserted at end: " + data);
    }

    // Delete the last node of the linked list
    public void deleteLast() {
        if (first == null) {
            System.out.println("List is empty. No node to delete.");
            return;
        }
        if (first.next == null) {
            System.out.println("Node deleted from end: " + first.data);
            first = null;
            return;
        }
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Node deleted from end: " + temp.next.data);
        temp.next = null;
    }

    // Delete a node from specified position
    public void deleteAtPosition(int position) {
        if (first == null || position < 0) {
            System.out.println("List is empty or invalid position.");
            return;
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        Node temp = first;
        Node predecesor = null;
        int index = 0;

        while (temp != null && index < position) {
            predecesor = temp;
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position not found.");
            return;
        }

        System.out.println("Node deleted from position " + position + ": " + temp.data);
        predecesor.next = temp.next;
    }
}

public class LinkedListMenu {
    public static void main(String[] args) {
        SingklyLinkedList list = new SingklyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node");
            System.out.println("4. Insert a node at the end");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at front: ");
                    data = sc.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    position = sc.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
