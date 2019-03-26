package hoanghung.com.demo.singleton;

public class SingleTonCls {

    private static SingleTonCls singleTonCls = new SingleTonCls();

    private SingleTonCls() {}

    public static SingleTonCls getInstance() {
        return singleTonCls == null ? new SingleTonCls() : singleTonCls;
    }
}
