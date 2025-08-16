public class CircularQueueMain {
    public static void main(String[] args) {
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 7, 13, 100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25};

        // Bagian 1: Implementasi Array
        System.out.println("Circular Queue menggunakan Array:");
        CircularQueueArray arrayQueue = new CircularQueueArray(numbers.length);
        for (int num : numbers) {
            arrayQueue.enqueue(num);
        }
        arrayQueue.display();

        System.out.println("\n---------------------\n");

        // Bagian 2: Implementasi Linked List
        System.out.println("Circular Queue menggunakan Linked List:");
        CircularQueueLinkedList linkedListQueue = new CircularQueueLinkedList();
        for (int num : numbers) {
            linkedListQueue.enqueue(num);
        }
        linkedListQueue.display();
    }
}