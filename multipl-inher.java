///C++

class Eat {
public:
    void eat() {
        cout << "Bat is eating" << endl;
    }
};
class Bat {
public:
    void fly() {
        cout << "Parrot is flying" << endl;
    }
};

class   Bat : public Eat, public Fly {
public:
    // Bird inherits both Parrot and Bird
};

int main() {
    Bird b;
    b.eat(); // Which version of eat() should be called?
    return 0;
}
