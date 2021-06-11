package cn.wn.test;

import cn.wn.entity.Classes;
import cn.wn.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
public class Test_bean_IoC_DI {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
//        String[] beanNames = applicationContext.getBeanDefinitionNames();
//        for(String beanName :beanNames) {
//            System.out.println("beanName: " + beanName);
//        }

        Classes classes = (Classes) applicationContext.getBean("classes");
        System.out.println("classes = " + classes);
//        Student student = (Student) applicationContext.getBean("student");
//        System.out.println("student = " + student);
    }
}
