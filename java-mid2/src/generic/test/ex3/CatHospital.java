package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("Animal Name: " + animal.getName());
        System.out.println("Animal Size: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
