package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
try (ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml")) { //Xml configuration

    Dev dev = context.getBean(Dev.class);
    dev.setAge(25);
    System.out.println(dev.getAge());
    //dev.build();
}
    }
}