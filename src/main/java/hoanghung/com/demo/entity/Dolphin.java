package hoanghung.com.demo.entity;

import lombok.Data;

@Data
public class Dolphin extends Animal {
    private int numOfLegs;

    public Dolphin(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void run() {
        System.out.println("I am Dolphin. I run by swimming on the water");
    }
}
