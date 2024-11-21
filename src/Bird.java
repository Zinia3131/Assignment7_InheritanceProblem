public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void layEggs() {
        System.out.println(getName() + " is laying eggs.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps or squawks.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bird, Wing Span: " + wingSpan + " meters");
    }
}
