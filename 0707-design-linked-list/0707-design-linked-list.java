class MyLinkedList {
    private static class Node{
        int val;
        Node next;
        public Node (int val){
            this.val = val;
            this.next = next;
        }
    }
    Node head = null;
    Node tail = null;
    int currSize = 0;
      

    public MyLinkedList() {
        head = null;
    }

    // Get value at a particular index
    public int get(int index) {

        int idx = 0;
        Node curr = head;

        while (curr != null) {

            if (idx == index) {
                return curr.val;
            }

            curr = curr.next;
            idx++;
        }

        return -1;
    }

    // Insert at the beginning
    public void addAtHead(int val) {

        Node newNode = new Node(val);

        // New node points to current head
        newNode.next = head;

        // New node becomes the head
        head = newNode;
    }

    // Insert at the end
    public void addAtTail(int val) {

        Node newNode = new Node(val);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        // Reach last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Last node points to new node
        curr.next = newNode;
    }

    // Insert at a particular index
    public void addAtIndex(int index, int val) {

        // Index 0 → insert at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;
        Node prev = null;
        int idx = 0;

        // Find node at 'index'
        while (curr != null && idx < index) {

            prev = curr;
            curr = curr.next;
            idx++;
        }

        // Index is greater than list size
        if (idx < index) {
            return;
        }

        Node newNode = new Node(val);

        // prev → newNode → curr
        prev.next = newNode;
        newNode.next = curr;
    }

    // Delete node at a particular index
    public void deleteAtIndex(int index) {

        // Empty list
        if (head == null) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;
        int idx = 0;

        // Find node at index
        while (curr != null && idx < index) {

            prev = curr;
            curr = curr.next;
            idx++;
        }

        // Index doesn't exist
        if (curr == null) {
            return;
        }

        // Remove curr
        // prev → curr → next
        // prev ───────→ next
        prev.next = curr.next;
    }
}