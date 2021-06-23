package cn.wn.test;

import cn.wn.controller.MyController;
import cn.wn.entity.Repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/21
 * @description
 */
public class Test_annotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
//        Repository repository = (Repository) applicationContext.getBean("myrepo");
//        System.out.println("repository = " + repository);

//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println("beanDefinitionNames = " + name);
//        }

        MyController myController = applicationContext.getBean(MyController.class);
        String result = myController.service(new Double(99));
        System.out.println("result = " + result);
    }
}
