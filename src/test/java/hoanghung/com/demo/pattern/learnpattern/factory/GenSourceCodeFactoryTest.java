package hoanghung.com.demo.pattern.learnpattern.factory;

import hoanghung.com.demo.pattern.learnpattern.ultility.SourceLogicType;

public class GenSourceCodeFactoryTest {

    public static void main(String args[]) {
        GenSourceCode genController
                = GenSourceCodeFactory.genSourceCode(
                        SourceLogicType.CONTROLLER.toString(), "@Controller", "I'm in Controller Layer");

        GenSourceCode genService
                = GenSourceCodeFactory.genSourceCode(
                        SourceLogicType.SERVICE.toString(), "@Service", "I'm in Model Layer");

        System.out.println("Controller:: " + genController);
        System.out.println("Service:: " + genService);
    }
}