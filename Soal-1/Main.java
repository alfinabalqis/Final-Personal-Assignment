// Main Class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        Animal deer = new Herbivore("Rusa", "Cervidae");
        Animal tiger = new Carnivore("Harimau", "Panthera tigris");

        // Memanggil metode polimorfisme
        deer.displayFoodInfo();
        tiger.displayFoodInfo();
    }
}
