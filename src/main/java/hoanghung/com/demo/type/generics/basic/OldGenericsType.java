package hoanghung.com.demo.type.generics.basic;

import lombok.Data;

@Data
public class OldGenericsType {
    private Object t;

    public static void main(String args[]) {
        OldGenericsType ogt = new OldGenericsType();
        ogt.setT("String");
        System.out.println(ogt);
    }
}
