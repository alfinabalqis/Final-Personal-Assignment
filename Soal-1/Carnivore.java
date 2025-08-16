// Child Class: Carnivore
class Carnivore extends Animal {
    public Carnivore(String name, String species) {
        super(name, species);
    }

    @Override
    public void displayFoodInfo() {
        System.out.println(getName() + " (" + getSpecies() + ") makan daging.");
    }
}