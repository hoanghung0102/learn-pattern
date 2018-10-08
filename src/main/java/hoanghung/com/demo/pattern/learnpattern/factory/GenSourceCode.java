package hoanghung.com.demo.pattern.learnpattern.factory;

abstract class GenSourceCode {

    abstract String getAnnotation();
    abstract String getContentLogic();

    @Override
    public String toString() {
        return "Annotation: " + getAnnotation() + " Content: " + getContentLogic();
    }
}
