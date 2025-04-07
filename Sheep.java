public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;

        System.out.println("Creating Sheep with name: " + name);
        System.out.println("Sheep \""+this.name+"\" has " + legs + " legs, makes sound: " + sound + ", eats: " + food);
    }

    @Override
    public void makeSound() {
        System.out.println("The sheep named "+this.name+" goes: " + sound);
    }
    @Override
    public String getType() {
        return "Sheep";
    }
    @Override
    public Sheep clone() {
        return new Sheep(this.legs, this.sound, this.food, this.name);
    }
}
