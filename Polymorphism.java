class Animal {
    public void makeSound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barking");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
