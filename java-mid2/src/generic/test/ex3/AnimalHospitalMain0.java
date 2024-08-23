package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        // dog hospital
        dogHospital.set(dog);
        dogHospital.checkup();

        // cat hospital
        catHospital.set(cat);
        catHospital.checkup();

        // point1: transfer data from dog to cat
//        dogHospital.set(cat); //different type occurring exception

        // point2: dog type-casting
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
