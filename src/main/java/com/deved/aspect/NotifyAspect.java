package com.deved.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class NotifyAspect {

    @After(value = "@annotation(com.deved.util.Notify)")
    public void notifyTest(JoinPoint joinPoint){
        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);
    }
}
