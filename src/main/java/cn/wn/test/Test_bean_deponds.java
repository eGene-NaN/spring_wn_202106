package cn.wn.test;

import cn.wn.entity.Account;
import cn.wn.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
public class Test_bean_deponds {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-deponds.xml");
    }
}
