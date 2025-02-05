// Abstract class Bharatvanshi
abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}


class Pandav extends Bharatvanshi {
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    void obey() {
        System.out.println("Pandav obeys the rules.");
    }

    void kind() {
        System.out.println("Pandav is kind.");
    }
}


class Kaurav extends Bharatvanshi {
    void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    void obey() {
        System.out.println("Kaurav disobeys the rules.");
    }

    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}


class Arjun extends Pandav {
    
}


class Bheem extends Pandav {
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}


class Duryodhan extends Kaurav {
    
}


class Vikarn extends Kaurav {
    void obey() {
        System.out.println("Vikarn obeys the rules.");
    }

    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

public class Test {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
