package cn.wn.aop;

import cn.wn.aop.impl.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author eGene
 * @date 2021/06/23
 * @description
 */
public class Test_aop_annotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10, 3);
        cal.sub(10, 3);
        cal.mul(10, 3);
        cal.div(10, 3);
    }
}
