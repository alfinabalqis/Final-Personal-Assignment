class CircularQueueLinkedList {
    private NodeCircular front;
    private NodeCircular rear;
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
        NodeCircular newNode = new NodeCircular(item);
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
        NodeCircular current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}