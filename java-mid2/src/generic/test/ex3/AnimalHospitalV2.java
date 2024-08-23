package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal size: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
