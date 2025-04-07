public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;

        System.out.println("Creating Horse with " + legs + " legs, makes sound: " + sound + ", eats: " + food + ", color: " + color);
    }

    @Override
    public void makeSound() {
        System.out.println("The horse goes: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public Horse clone() {
        return new Horse(this.legs, this.sound, this.food, this.color);
    }
    
}
