package Design_Algo_Analysis.practical;

public class LinkedListDemo {
// practical 10
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head; // head of the list

        // Method to append a node at the end of the list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node last = head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
        }

        // Method to remove a node with the given key
        public void remove(int key) {
            Node current = head, prev = null;

            // If the head node itself holds the key
            if (current != null && current.data == key) {
                head = current.next; // Changed head
                return;
            }

            // Search for the key to be deleted, keep track of the previous node as we need to change temp.next
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

            // If key was not present in the list
            if (current == null) return;

            // Unlink the node from the list
            prev.next = current.next;
        }

        // Method to print the LinkedList
        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Created linked list is:");
        list.printList();

        list.remove(3); // Delete node with data 3

        System.out.println("\nLinked list after deletion of 3:");
        list.printList();
    }
}
