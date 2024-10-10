/* Create a superclass Animal and its subclasses Cat and Horse.
a. The Animal class has an animal name and a method breathe, which simply prints "Breathing" to the console.
b. Add a method talk to the subclasses, which prints the animal's sound to the console and also calls the parent class's breathing method five times.
c. In the main program, create a cat and a horse in their own type variables and call the talk method for them.
d. Also create an Animal-type variable to hold a Cat object and call the breathe method for it.
Try to call the talk method as well. Will the call succeed?" */

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println("Breathing");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Meow");
        for (int i = 0; i < 5; i++) {
            super.breathe();
        }
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Ihhahaa");
        for (int i = 0; i < 5; i++) {
            super.breathe();
        }
    }
}

public class Main {
    public static void main(String [] args) {
        Cat cat = new Cat("Cat");
        Horse horse = new Horse("Horse");

        cat.talk();
        horse.talk();

        Animal animal = new Cat("Cat");

        animal.breathe();
        animal.talk();
    }
}