package cn.wn.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author eGene
 * @date 2021/06/23
 * @description
 */
@Component
@Aspect
public class LoggerAspect {

    @Before("execution(public int cn.wn.aop.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name + "方法的参数是" + args);
    }

    @After("execution(public int cn.wn.aop.impl.CalImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行完毕");
    }

    @AfterReturning(value = "execution(public int cn.wn.aop.impl.CalImpl.*(..))", returning = "result")
    public void afterReturn(JoinPoint joinpoint, Object result) {
        String name = joinpoint.getSignature().getName();
        System.out.println(name + "方法执行结果" + result);
    }

    @AfterThrowing(value = "execution(public int cn.wn.aop.impl.CalImpl.*(..))", throwing = "ex")
    public void AfterThrowing(JoinPoint joinPoint, Exception ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛出异常" + ex);
    }
}
