// Superclass: Animal
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to make a sound
    public abstract void makeSound();

    // Display basic details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
