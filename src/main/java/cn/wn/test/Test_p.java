package cn.wn.test;

import cn.wn.entity.DataSource;
import cn.wn.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/11
 * @description
 */
public class Test_p {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Student Student = (Student) applicationContext.getBean("student");
        System.out.println("Student = " + Student);
    }
}
