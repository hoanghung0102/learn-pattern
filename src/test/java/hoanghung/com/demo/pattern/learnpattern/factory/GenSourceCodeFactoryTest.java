package hoanghung.com.demo.pattern.learnpattern.factory;

import hoanghung.com.demo.ultitlity.SourceLogicType;

import java.util.ArrayList;
import java.util.List;

public class GenSourceCodeFactoryTest {

    public static void main(String args[]) {
        GenSourceCode genController
                = GenSourceCodeFactory.genSourceCode(
                        SourceLogicType.CONTROLLER.toString(), "@Controller", "I'm in Controller Layer");

        GenSourceCode genService
                = GenSourceCodeFactory.genSourceCode(
                        SourceLogicType.SERVICE.toString(), "@Service", "I'm in Model Layer");

        List l1 = new ArrayList<String>();
        l1.add("hung1");
        l1.set(0, "hung2");
        System.out.println("l1" + l1);
        List<String> l2 = new ArrayList<>();
        l2.add("hung2");
        l2.set(0, "hung1");
        System.out.println("l2" + l2);

        System.out.println("Controller:: " + genController);
        System.out.println("Service:: " + genService);

        String a = "Hung";
        String b = a;
        String c = "Hung";
        String d = "Hung";
        String e = new String(a);

        System.out.println("Result compare is " + (a == b));
        System.out.println("Result compare is " + (a.equals(b)));
        System.out.println("Result compare is " + (a == d));
        System.out.println("Result compare is " + (a == e));
        System.out.println("Result compare is " + (a.equals(e)));
    }
}