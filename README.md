# multipleinher-not-suport-by-java

the java does not support multiple inheritance which voilates the object oriented pgmng language,,,so java cant be called as a purely object oriented...
In C++,when there are too many parent classes there will be occurence of confliction when we are inheriting methods of that parent classes..we cant know which method should be called .......
But,Here(Java) we can inherit from multiple parents using interfaces
interfaces(mammal,bird)---
child class(bat)---
another class can be created (parrot) which implements bird
so there will be no occurence of confliction here...
so bat will be having its own implementation of interfaces unlike in c++(multiple inheritance using classes)
and parrot willbe having its own implementation...so--bats eat method can be called and parrots eat method can be called


Ambiguity with Identical Method Names: If both base classes define methods with the same name,
    you need to use the scope resolution operator (::) to specify which method you're referring to when calling it from the derived class.
    ..As the number of base classes increases, the complexity of the hierarchy can become harder to manage and understand.
Here in C++ the derived class(Bat) implementing Eat and Fly classes...but by providing interfaces we can have own implementation of derived classes
