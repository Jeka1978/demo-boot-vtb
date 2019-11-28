package com.vtb.demobootvtb.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
//@Aspect
public class QuoterAspect {

    @Around("execution(* com.vtb.demobootvtb..*.say*(..)) ")
    @SneakyThrows
    public Object handleSayMethods(ProceedingJoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("Цитата "+simpleName+" : ");
        Object retVal = jp.proceed();
        System.out.println("цонец Цитаты "+simpleName+" : ");
        return retVal;

    }


}
