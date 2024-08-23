package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        // dog hospital
        dogHospital.set(dog);
        dogHospital.checkup();

        // cat hospital
        catHospital.set(cat);
        catHospital.checkup();

        // point1: transfer data from dog to cat
//        dogHospital.set(cat); //success to check parameter type: compile exception not occurring

        // point2: dog type-casting
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
