// First parent class
Interface Mammal {
    void eat();

    void sleep();
}

// Second parent class
Interface Bird {
    void eat();

    void fly() ;
}

// Class representing a Bat inheriting from Mammal and Bird using interfaces
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
class Parrot implements Bird{
    @Override
    public void eat(){
        System.out.println("Parrot is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Parrot p=new Parrot();
        bat.eat();   // Bat's implementation of eat()
        p.eat();//parrots implementation of eat()
        bat.sleep(); // Bat's implementation of sleep()
        bat.fly();   // Bat's implementation of fly()
    }
}
