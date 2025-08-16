// Child Class: Herbivore
class Herbivore extends Animal {
    public Herbivore(String name, String species) {
        super(name, species);
    }

    @Override
    public void displayFoodInfo() {
        System.out.println(getName() + " (" + getSpecies() + ") makan tumbuhan.");
    }
}