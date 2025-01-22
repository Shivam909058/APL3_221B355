// Mother class
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

// Child class
class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

// Application class
public class TestOverriding {
    public static void main(String[] args) {
        Mother obj1 = new Mother();
        obj1.show(); // This will call the show() method of Mother class

        Child obj2 = new Child();
        obj2.show(); // This will call the overridden show() method of Child class
    }
}
