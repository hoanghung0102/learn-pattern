package hoanghung.com.demo.type.generics.adv;

import hoanghung.com.demo.entity.Animal;
import hoanghung.com.demo.entity.Bird;
import hoanghung.com.demo.entity.Dog;
import hoanghung.com.demo.entity.Dolphin;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AnimalGenericType<T extends Animal> {

    private T t;

    public static void main(String args[]) {
        AnimalGenericType agt = new AnimalGenericType();
        System.out.println(agt);

        AnimalGenericType<Dog> dog = new AnimalGenericType();
        dog.setT(new Dog(4));
        AnimalGenericType<Bird> bird = new AnimalGenericType();
        bird.setT(new Bird(2));
        AnimalGenericType<Dolphin> dolphin = new AnimalGenericType();
        dolphin.setT(new Dolphin(0));

        List<AnimalGenericType> lst = new ArrayList<>();
        lst.add(dog);
        lst.add(bird);
        lst.add(dolphin);

        // Output
        lst.forEach(it -> sprintObj(it.getT()));
    }

    public static void sprintObj(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            dog.run();
        } else if (obj instanceof Bird) {
            Bird bird = (Bird) obj;
            bird.run();
        } else {
            Animal animal = (Animal) obj;
            animal.run();
        }
    }
}
