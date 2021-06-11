package cn.wn.test;

import cn.wn.entity.Account;
import cn.wn.entity.DataSource;
import cn.wn.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
public class Test_properties {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println("dataSource = " + dataSource);
    }
}
