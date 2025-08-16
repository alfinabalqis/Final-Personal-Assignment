class HashTableLinearProbing {
    private String[] table;
    private int size;
    
    public HashTableLinearProbing(int size) {
        this.size = size;
        this.table = new String[size];
    }
    
    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash % size;
    }
    
    public void insert(String key) {
        int index = hash(key);
        System.out.println(key + " -> hash = " + index);
        
        // Linear Probing jika collision
        while (table[index] != null) {
            System.out.println("Collision! Probing to " + ((index + 1) % size));
            index = (index + 1) % size;
        }
        
        table[index] = key;
        System.out.println(key + " inserted at index " + index);
    }
    
    public void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + 
                (table[i] == null ? "null" : table[i]));
        }
    }
    
    public static void main(String[] args) {
        HashTableLinearProbing ht = new HashTableLinearProbing(8);
        String[] items = {"Anting", "Baju", "Celana", "Gelas", 
                         "Gunting", "Handphone", "Buku", "Garpu"};
        
        for (String item : items) {
            ht.insert(item);
        }
        
        ht.display();
    }
}