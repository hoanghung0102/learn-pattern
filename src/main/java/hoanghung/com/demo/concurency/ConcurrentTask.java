package hoanghung.com.demo.concurency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentTask {
    private static List tasks = Collections.synchronizedList(new ArrayList<>());

    public static void main(String args[]) {
        tasks.clear();
    }
}
