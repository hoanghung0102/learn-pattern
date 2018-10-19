package hoanghung.com.demo.pattern.learnpattern.factory;

import hoanghung.com.demo.ultitlity.SourceLogicType;

public class GenSourceCodeFactory {

    public static GenSourceCode genSourceCode(String type, String declare, String function) {

        if (SourceLogicType.CONTROLLER.toString().equals(type)) {
            return new GenSourceController(declare, function);
        } else {
            return new GenSourceService(declare, function);
        }
    }
}
