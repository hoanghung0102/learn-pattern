package hoanghung.com.demo.pattern.learnpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hoanghung.com.demo.endpoint")
public class LearnPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnPatternApplication.class, args);
    }
}
