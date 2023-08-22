interface Mammal {
    void eat();
    void sleep();
}

interface Bird {
    void eat();
    void fly();
}

class Bat implements Mammal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying.");
    }
}

class Parrot implements Bird {
    @Override
    public void eat() {
        System.out.println("Parrot is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Parrot parrot = new Parrot();
        
        bat.eat();    // Bat's implementation of eat()
        bat.sleep();  // Bat's implementation of sleep()
        bat.fly();    // Bat's implementation of fly()
        
        parrot.eat(); // Parrot's implementation of eat()
        parrot.fly(); // Parrot's implementation of fly()
    }
}
