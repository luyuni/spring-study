package top.luyuni.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.luyuni.ss.entity.People;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/application.xml");
        People people = context.getBean(People.class);
        System.out.println(people.getId());
        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}
