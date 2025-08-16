public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Insert number after a specific number
    public void insertAfter(int key, int data) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Angka " + key + " tidak ditemukan.");
        }
    }

    // Delete spesific number
    public void delete(int data) {
        if (head == null) {
            return;
        }
        // Jika data yang akan dihapus berada di head
        if (head.data == data) {
            head = head.next;
            return;
        }
        // Cari node sebelum node yang akan dihapus
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        // Jika node ditemukan, hapus
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Angka " + data + " tidak ditemukan.");
        }
    }
}