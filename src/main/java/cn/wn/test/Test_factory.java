package cn.wn.test;

import cn.wn.entity.Car;
import cn.wn.entity.DataSource;
import cn.wn.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/11
 * @description
 */
public class Test_factory {

    public static void main(String[] args) {

        // 传统调用方法
//        Car car1 = StaticCarFactory.getCar(1);
//        System.out.println("car1 = " + car1);

        // 通过静态工厂方法IoC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println("car1 = " + car1);

    }
}
