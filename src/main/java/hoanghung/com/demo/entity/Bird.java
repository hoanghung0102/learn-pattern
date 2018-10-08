package hoanghung.com.demo.entity;

import lombok.Data;

@Data
public class Bird extends Animal {
    private int numOfLegs;

    public Bird(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void run() {
        System.out.println("I am Bird. I run by flying on the sky");
    }
}
