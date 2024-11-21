// Subclass: Reptile
class Reptile extends Animal {
    private double tailLength;

    public Reptile(String name, int age, double tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void shedSkin() {
        System.out.println(getName() + " is shedding its skin.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " hisses or makes a reptile sound.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Reptile, Tail Length: " + tailLength + " meters");
    }
}

