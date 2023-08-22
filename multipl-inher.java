class Bat {
public:
    void eat() {
        cout << "Bat is eating" << endl;
    }
    void fly() {
        cout << "Bat is flying" << endl;
    }
};
class Parrot {
public:
    void eat() {
        cout << "Parrot is eating" << endl;
    }
    void fly() {
        cout << "Parrot is flying" << endl;
    }
};

class   Bird : public Bat, public Parrot {
public:
    // Bird inherits both Parrot and Bird
};

int main() {
    Bird b;
    b.eat(); // Which version of eat() should be called?
    return 0;
}
