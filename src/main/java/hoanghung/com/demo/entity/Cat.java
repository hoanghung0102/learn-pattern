package hoanghung.com.demo.entity;

import lombok.Data;

@Data
public class Cat extends Animal {
    private int numOfLegs;

    public Cat(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void run() {
        System.out.println("I am Cat. I run by 4 legs on the land");
    }
}
