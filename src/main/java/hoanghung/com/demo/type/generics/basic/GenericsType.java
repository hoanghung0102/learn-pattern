package hoanghung.com.demo.type.generics.basic;

import lombok.Data;

@Data
public class GenericsType<T> {
    private T t;

    public static void main(String args[]) {
        GenericsType<String> str = new GenericsType<>();
        str.setT("Hung");
        System.out.println(str);

        GenericsType<Integer> number = new GenericsType<>();
        number.setT(10);
        System.out.println(number);
    }
}
