package cn.wn.test;

import cn.wn.entity.Account;
import cn.wn.entity.Classes;
import cn.wn.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
public class Test_bean_scope {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");

        // Spring中Bean的作用域，通过设置scope来实现。
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println("user1与user2是否为同一个对象？");
        System.out.println(user1 == user2);

        // Spring中Bean的继承
        User user3 = (User) applicationContext.getBean("user1");
        System.out.println("user3 = " + user3);
        User user4 = (User) applicationContext.getBean("user2");
        System.out.println("user4 = " + user4);

        Account account= (Account) applicationContext.getBean("account");
        System.out.println("account = " + account);
    }
}
