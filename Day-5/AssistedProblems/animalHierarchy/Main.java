public class Main {
    public static void main(String[] args) {

        // Create an object of animal
        Animal animal = new Animal();
        animal.makeSound(); // Animal makes sound

        // Create an object of Dog
        Dog dog = new Dog();
        dog.makeSound();    // Inherited from Animal

        // Create an object of Cat
        Cat cat = new Cat();
        cat.makeSound();    // Inherited from Animal

        // Create an object of Bird
        Bird bird = new Bird();
        bird.makeSound();   // Inherited from Animalcd

    }

}
