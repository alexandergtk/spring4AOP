package com.estudo.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * @author Alexander Silva
 * 
 * Descomentar os métodos de acordo com a execução.
 */
@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* com.estudo.service.Cliente.addCliente(..))")
//    public void logBefore(JoinPoint joinPoint) {
//
//        System.out.println("logBefore() em execução!");
//        System.out.println("Antes do Main : " + joinPoint.getSignature().getName());
//    }
    
//    @After("execution(* com.estudo.service.Cliente.addCliente(..))")
//    public void logAfter(JoinPoint joinPoint) {
//
//        System.out.println("logAfter() executado!");
//        System.out.println("Depois do Main : " + joinPoint.getSignature().getName());
//    }

//    @AfterReturning(pointcut = "execution(* com.estudo.service.Cliente.addClienteReturnValue(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//
//        System.out.println("logAfterReturning() em execução!");
//        System.out.println("Interceptado : " + joinPoint.getSignature().getName());
//        System.out.println("Retorno do valor  : " + result);
//    }

//    @AfterThrowing(pointcut = "execution(* com.mkyong.customer.bo.Cliente.addClienteThrowException(..))", throwing = "error")
//    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
//
//        System.out.println("logAfterThrowing() is running!");
//        System.out.println("Execução do método : " + joinPoint.getSignature().getName());
//        System.out.println("Exception : " + error);
//    }

//    @Around("execution(* com.estudo.service.Cliente.addClienteAround(..))")
//    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        System.out.println("logAround() em execução!");
//        System.out.println("Interceptado : " + joinPoint.getSignature().getName());
//        System.out.println("Argumentos interceptados : " + Arrays.toString(joinPoint.getArgs()));
//
//        System.out.println("Antes do Main!");
//        joinPoint.proceed(); // Chama o método atualizar
//        System.out.println("Depois do Main!");
//    }

}