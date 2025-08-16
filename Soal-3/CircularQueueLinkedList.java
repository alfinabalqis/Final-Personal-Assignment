class CircularQueueLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public CircularQueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = front; // Membuat circular
        size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Circular Queue (Linked List): ");
        Node current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}