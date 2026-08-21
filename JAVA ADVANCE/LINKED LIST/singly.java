public class singly {

    // Node of the linked list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public Main() {
        head = null;
        tail = null;
        size = 0;
    }

    // =====================================================
    // INSERT METHODS
    // =====================================================

    // Insert at beginning
    public void insertHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // Insert at end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Insert at specific position
    // Position starts from 1
    public void insertAtPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Position out of range");
            return;
        }

        // Insert at beginning
        if (position == 1) {
            insertHead(data);
            return;
        }

        // Insert at end
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node prevNode = head;

        // Move to node before required position
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }

    // =====================================================
    // SEARCH / FIND METHODS
    // =====================================================

    // Search for a value
    // Returns true if found, otherwise false
    public boolean search(int data) {

        Node current = head;


        while (current != null) {

            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Find and return the Node
    public Node find(int data) {

        Node current = head;

        while (current != null) {

            if (current.data == data) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // =====================================================
    // DELETE METHODS
    // =====================================================

    // Delete first node
    public void deleteHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
            
        }

        head = head.next;
        size--;

        // If list becomes empty
        if (head == null) {
            tail = null;
        }
    }

    // Delete last node
    public void deleteTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node current = head;

        // Find node before tail
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;

        size--;
    }

    // Delete node at specific position
    public void deleteAtPosition(int position) {

        if (position < 1 || position > size) {
            System.out.println("Position out of range");
            return;
        }

        // Delete first node
        if (position == 1) {
            deleteHead();
            return;
        }

        // Delete last node
        if (position == size) {
            deleteTail();
            return;
        }

        Node prevNode = head;

        // Move to node before required position
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        // Remove node
        prevNode.next = prevNode.next.next;

        size--;
    }

    // Delete first node containing given value
    public boolean deleteValue(int data) {

        if (head == null) {
            return false;
        }

        // If head contains the value
        if (head.data == data) {
            deleteHead();
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == data) {

                // If deleting tail
                if (current.next == tail) {
                    tail = current;
                }

                current.next = current.next.next;
                size--;

                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete all nodes
    public void clear() {

        head = null;
        tail = null;
        size = 0;
    }

    // =====================================================
    // UTILITY METHODS
    // =====================================================

    // Display list
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Print each node on new line
    public void printList() {

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get head node
    public Node getHead() {
        return head;
    }

    // Get tail node
    public Node getTail() {
        return tail;
    }

    // Get head data
    public int getHeadData() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        return head.data;
    }

    // Get tail data
    public int getTailData() {

        if (tail == null) {
            throw new RuntimeException("List is empty");
        }

        return tail.data;
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================

    public static void main(String[] args) {

        Main list = new Main();

        // Insert at head
        list.insertHead(30);
        list.insertHead(20);
        list.insertHead(10);

        System.out.println("After inserting at head:");
        list.display();

        // Insert at tail
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.println("\nAfter inserting at tail:");
        list.display();

        // Insert at position
        list.insertAtPosition(3, 25);

        System.out.println("\nAfter inserting 25 at position 3:");
        list.display();

        // Search
        System.out.println("\nSearch 30: " + list.search(30));
        System.out.println("Search 100: " + list.search(100));

        // Find
        Node result = list.find(40);

        if (result != null) {
            System.out.println("Found node: " + result.data);
        } else {
            System.out.println("Node not found");
        }

        // Delete head
        list.deleteHead();

        System.out.println("\nAfter deleting head:");
        list.display();

        // Delete tail
        list.deleteTail();

        System.out.println("\nAfter deleting tail:");
        list.display();

        // Delete at position
        list.deleteAtPosition(2);

        System.out.println("\nAfter deleting position 2:");
        list.display();

        // Delete by value
        boolean deleted = list.deleteValue(30);

        System.out.println("\nDelete value 30: " + deleted);
        list.display();

        // Information
        System.out.println("\nSize: " + list.getSize());
        System.out.println("Is Empty: " + list.isEmpty());

        if (!list.isEmpty()) {
            System.out.println("Head: " + list.getHeadData());
            System.out.println("Tail: " + list.getTailData());
        }

        // Clear
        list.clear();

        System.out.println("\nAfter clear:");
        list.display();

        System.out.println("Size: " + list.getSize());
        System.out.println("Is Empty: " + list.isEmpty());
    }
}
