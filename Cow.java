public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;

        System.out.println("Creating Cow with " + legs + " legs, makes sound: " + sound + ", eats: " + food);
    }

    public void makeSound() {
        System.out.println("The cow goes: " + sound);
    }

    public String getType() {
        return "Cow";
    }

    public Cow clone() {
        return new Cow(this.legs, this.sound, this.food);
    }
}
