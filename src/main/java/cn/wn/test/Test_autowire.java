package cn.wn.test;

import cn.wn.entity.Person;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/21
 * @description
 */
public class Test_autowire {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println("person = " + person);
    }
}
