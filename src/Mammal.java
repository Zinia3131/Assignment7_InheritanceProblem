public class Mammal extends Animal {
    private int numberOfOffspring;

    public Mammal(String name, int age, int numberOfOffspring) {
        super(name, age);
        this.numberOfOffspring = numberOfOffspring;
    }

    public int getNumberOfOffspring() {
        return numberOfOffspring;
    }

    public void nurse() {
        System.out.println(getName() + " is nursing its offspring.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a mammal sound.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Mammal, Offspring: " + numberOfOffspring);
    }
}
