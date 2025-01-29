package Prob1;
// this is a example of static polymorphism 
abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    void makeVoice() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    void makeVoice() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    void makeVoice() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    void makeVoice() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    void makeVoice() {
        System.out.println("Roar");
    }
}

class Voice {
    Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}
