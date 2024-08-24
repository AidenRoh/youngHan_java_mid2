package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능: "? (앞으로 들어올 타입)" 의 super = 윗 타입만 가능하다
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // Animal 보다 낮은 타입은 불가능
//        writeBox(catBox); // Animal 보다 낮은 타입은 불가능
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("dog", 100));
    }
}
