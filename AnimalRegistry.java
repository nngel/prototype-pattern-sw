public class AnimalRegistry {

    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public void createSheep(String name) {
        sheepPrototype = new Sheep(4, "Baa", "Grass", name);
    }
    public void createCow() {
        cowPrototype = new Cow(4, "Moo", "Grass");
    }
    public void createHorse() {
        horsePrototype = new Horse(4, "Neigh", "Hay", "Brown");
    }

    public Sheep getSheep() {
        return sheepPrototype.clone();
    }
    public Cow getCow() {
        return cowPrototype.clone();
    }
    public Horse getHorse() {
        return horsePrototype.clone();
    }
    
}
