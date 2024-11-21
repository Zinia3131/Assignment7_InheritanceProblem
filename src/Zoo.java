import java.util.ArrayList;

class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    // Add an animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Added " + animal.getName() + " to the zoo.");
    }

    // Remove an animal
    public void removeAnimal(String name) {
        Animal toRemove = null;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                toRemove = animal;
                break;
            }
        }

        if (toRemove != null) {
            animals.remove(toRemove);
            System.out.println("Removed " + name + " from the zoo.");
        } else {
            System.out.println(name + " not found in the zoo.");
        }
    }

    // Display all animals
    public void displayAllAnimals() {
        System.out.println("\nZoo Animals:");
        for (Animal animal : animals) {
            animal.displayDetails();
        }
    }

    // Make all animals make their sound
    public void makeAllSounds() {
        System.out.println("\nAnimal Sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
