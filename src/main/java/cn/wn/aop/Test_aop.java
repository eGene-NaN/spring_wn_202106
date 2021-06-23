package cn.wn.aop;

import cn.wn.aop.impl.CalImpl;

/**
 * @author eGene
 * @date 2021/06/22
 * @description
 */
public class Test_aop {

    public static void main(String[] args) {
//        Cal cal = new CalImpl();
//        cal.add(10, 3);
//        cal.sub(10, 3);
//        cal.mul(10, 3);
//        cal.div(10, 3);

        // 实例化委托对象
        Cal cal = new CalImpl();
        // 获取代理对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal proxy = (Cal) myInvocationHandler.bind(cal);
        proxy.add(10, 3);
        proxy.sub(10, 3);
        proxy.mul(10, 3);
        proxy.div(10, 3);
    }
}
