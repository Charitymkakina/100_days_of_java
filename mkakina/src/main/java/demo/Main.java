package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
try (ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml")) {

    Dev dev = context.getBean(Dev.class);
    dev.build();
}
    }
}