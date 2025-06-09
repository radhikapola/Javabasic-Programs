class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    void add(int n) {
        Node newNode = new Node(n); // Corrected variable name
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class Addingelements{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display();
    }
}


