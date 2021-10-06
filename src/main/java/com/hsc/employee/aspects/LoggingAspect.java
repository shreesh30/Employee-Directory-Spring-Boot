package com.hsc.employee.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.hsc.employee.service.EmployeeServiceImpl.addEmployees(..))")
    public void beforeGetEmployees(JoinPoint joinPoint){
    System.out.println("<======Executing @Before "+joinPoint.getSignature()+"======>");
}

    @After("execution(* com.hsc.employee.service.EmployeeServiceImpl.deleteEmployee(..))")
    public void afterDeleteEmployee(JoinPoint joinPoint){
    System.out.println("<======Executing @After "+joinPoint.getSignature()+"======>");
}
}
