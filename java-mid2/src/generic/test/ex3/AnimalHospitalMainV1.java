package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Animal dog = new Dog("dog1", 100);
        Animal cat = new Cat("cat1", 300);

        // dog hospital
        dogHospital.set(dog);
        dogHospital.checkup();

        // cat hospital
        catHospital.set(cat);
        catHospital.checkup();

        // point1: transfer data from dog to cat
        dogHospital.set(cat); //fail to check parameter type: compile exception not occurring

        // point2: dog type-casting
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("dog2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
