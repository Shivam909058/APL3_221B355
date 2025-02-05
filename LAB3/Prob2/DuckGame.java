package Prob2;
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("All ducks can swim.");
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}


class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }
}


class WoodenDuck extends Duck {
    WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }
}

class RedHeadDuck extends Duck {
    RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}

class LakeDuck extends Duck {
    LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings.");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly.");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quacking.");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeaking.");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Mute.");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.performFly();
        lakeDuck.performQuack();
    }
}
