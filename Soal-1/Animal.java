// Parent Class: Animal

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    // Metode polimorfisme, akan di-override di subclass
    public void displayFoodInfo() {
        System.out.println("Tipe makanan tidak diketahui.");
    }
}
