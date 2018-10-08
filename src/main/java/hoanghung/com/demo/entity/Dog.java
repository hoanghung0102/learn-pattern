package hoanghung.com.demo.entity;

import lombok.Data;

@Data
public class Dog extends Animal {
    private int numOfLegs;

    public Dog(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void run() {
        System.out.println("I am Dog. I run by 4 legs");
    }
}
