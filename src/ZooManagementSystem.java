public class ZooManagementSystem {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Adding animals
        Mammal tiger = new Mammal("Tiger", 5, 2);
        Bird parrot = new Bird("Parrot", 2, 0.5);
        Reptile snake = new Reptile("Snake", 3, 1.2);

        zoo.addAnimal(tiger);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);

        // Display all animals
        zoo.displayAllAnimals();

        // Make all animals make a sound
        zoo.makeAllSounds();

        // Specific actions
        tiger.nurse();
        parrot.layEggs();
        snake.shedSkin();

        // Remove an animal
        zoo.removeAnimal("Parrot");

        // Display all animals after removal
        zoo.displayAllAnimals();
    }
}

