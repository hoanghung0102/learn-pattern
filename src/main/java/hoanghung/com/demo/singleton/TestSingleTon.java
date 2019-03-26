package hoanghung.com.demo.singleton;

public class TestSingleTon {

    public static void main(String... args) {
        SingleTonCls singleTonCls1 = SingleTonCls.getInstance();
        SingleTonCls singleTonCls2 = SingleTonCls.getInstance();
        System.out.println("Has code = " + singleTonCls1.hashCode());
        System.out.println("Has code = " + singleTonCls2.hashCode());

        // When instance by new object from single creation
        // SingleTonCls singleTonCls3 = new SingleTonCls();
    }
}
