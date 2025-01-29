package Prob2;
// so this is example of dynamix polymorhisim
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
    void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        hear(animals);
    }

    void hear(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeVoice();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice(); // no need to call hear beacauuse it is alredy called in prepare voice 
    }
}
