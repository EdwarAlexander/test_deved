package com.deved.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AccessProductAspect {

    @Before(value = "@annotation(com.deved.util.AccessProduct)")
    public void accessProductTest(JoinPoint joinPoint){
      log.info("Se ejecuto antes");
    }
}
