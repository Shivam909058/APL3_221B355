class Mother {
    static void show() {
        System.out.println("Mother's static show()");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child's static show()");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Calls Mother's static show() method
    }
}
