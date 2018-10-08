package hoanghung.com.demo.pattern.learnpattern.factory;

class GenSourceSql extends GenSourceCode {

    private String annotation;
    private String contentLogic;

    public GenSourceSql(String annotation, String contentLogic) {
        this.annotation = annotation;
        this.contentLogic = contentLogic;
    }

    @Override
    public String getAnnotation() {
        return this.annotation;
    }

    @Override
    public String getContentLogic() {
        return this.contentLogic;
    }
}
