package cn.wn.test;

import cn.wn.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
public class Test {

    public static void main(String[] args) {
        // 传统的方式，手动创建对象。
        /*Student student = new Student();
        System.out.println("student = " + student);*/

        // IoC容器自动创建对象，开发者只需要取出对象即可。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("Student1");
        System.out.println("student1 = " + student);

        Student student3 = (Student) applicationContext.getBean("Student3");
        System.out.println("student3 = " + student3);
    }
}
