public class SingleLinkedListOperation {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 36, 16, 35, 14, 30, 25, 7, 13, 100, 12, 70, 24, 40};

        // a. Insert semua angka dan tampilkan
        System.out.println("a. Memasukkan semua angka dan menampilkan Linked List:");
        for (int num : numbers) {
            list.insert(num);
        }
        list.display();

        // b. Insert angka 100 setelah angka 12
        System.out.println("\nb. Melakukan insert angka 15 setelah 12:");
        list.insertAfter(12, 15);
        list.display();

        // c. Hapus angka 24
        System.out.println("\nc. Melakukan delete angka 24:");
        list.delete(24);
        list.display();
    }
}
