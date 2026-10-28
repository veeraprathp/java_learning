public class polymorphism {
    public static void main(String[] args) {
        // Create an object of the parent class
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound

        // Create an object of the Dog class
        Dog myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        // Create an object of the Cat class
        Cat myCat = new Cat();
        myCat.sound(); // Output: Cat meows
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
     