public class TestAnimal{
    public static void main(String[] args) {

        System.out.println(" -- Creating Animal Registry");
        AnimalRegistry registry = new AnimalRegistry();
        registry.createSheep("Dolly");
        registry.createCow();
        registry.createHorse();

        System.out.println();

        System.out.println(" -- Creating Sheep 1 from prototype");
        Animal sheep1 = registry.getSheep();
        sheep1.makeSound();

        System.out.println();

        System.out.println(" -- Cloning Sheep 1");
        Animal sheep2 = sheep1.clone();
        sheep2.makeSound();

        System.out.println();

        System.out.println(" -- Creating Cow 1 from prototype");
        Animal cow1 = registry.getCow();
        cow1.makeSound();

        System.out.println();

        System.out.println(" -- Cloning Cow 1");
        Animal cow2 = cow1.clone();
        cow2.makeSound();

        System.out.println();

        System.out.println(" -- Creating Horse 1 from prototype");
        Animal horse1 = registry.getHorse();
        horse1.makeSound();

        System.out.println();

        System.out.println(" -- Cloning Horse 1");
        Animal horse2 = horse1.clone();
        horse2.makeSound();

        System.out.println();

        System.out.println(" -- getting type of each animal");
        System.out.println("Sheep 1 type: " + sheep1.getType());
        System.out.println("Sheep 2 type: " + sheep2.getType());
        System.out.println("Cow 1 type: " + cow1.getType());
        System.out.println("Cow 2 type: " + cow2.getType());
        System.out.println("Horse 1 type: " + horse1.getType());
        System.out.println("Horse 2 type: " + horse2.getType());
        
        System.out.println();
        

    }
}