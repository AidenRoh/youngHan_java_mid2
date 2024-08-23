package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 100);

//         AnimalMethod.<Dog>checkup(dog1);
         AnimalMethod.checkup(dog);
//         AnimalMethod.<Cat>checkup(cat1);
         AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("bigger dog", 200);
        Dog biggerDog = AnimalMethod.getBigger(dog, targetDog);

    }
}
