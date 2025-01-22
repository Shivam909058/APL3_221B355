package Prob4;
class One {
    One(int x) {
        System.out.println("One's constructor with parameter: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Two's constructor with parameter: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Two t = new Two(10);
    }
}
