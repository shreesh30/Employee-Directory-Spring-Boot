package com.hsc.employee.aspects;

import com.hsc.employee.entity.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.hsc.employee.service.EmployeeServiceImpl.addEmployees(..))")
    public void beforeAddEmployees(JoinPoint joinPoint){
    System.out.println("<======Executing @Before "+joinPoint.getSignature()+"======>");
}

    @After("execution(* com.hsc.employee.service.EmployeeServiceImpl.deleteEmployee(..))")
    public void afterDeleteEmployee(JoinPoint joinPoint){
    System.out.println("<======Executing @After "+joinPoint.getSignature()+"======>");
}
    @AfterReturning(pointcut = "execution(* com.hsc.employee.service.EmployeeServiceImpl.getEmployees(..))",returning = "employees")
    public void afterReturningGetEmployees(JoinPoint joinPoint, List<Employee> employees){
        System.out.println("<======Executing @AfterReturning "+joinPoint.getSignature()+"======>");
        System.out.println(employees);
    }
    @AfterThrowing(pointcut="execution(* com.hsc.employee.service.EmployeeServiceImpl.updateEmployee(..))",throwing = "theExc")
    public void afterThrowingUpdateEmployee(JoinPoint joinPoint,Throwable theExc){
        System.out.println("<======Executing @AfterThrowing "+joinPoint.getSignature()+"======>");
        System.out.println("The Exception thrown is : "+theExc);
    }

    @Pointcut("execution(* com.hsc.employee.service.EmployeeServiceImpl.getEmployee(..))")
    public void logGetEmployee(){}

    @Around(value="logGetEmployee()")
    public void aroundGetEmployee(ProceedingJoinPoint jp)throws Throwable{
        System.out.println("The method aroundGetEmployee() before invokation of the method " + jp.getSignature() + " method");
        try
        {
            jp.proceed();
        }
        finally
        {
        }
        System.out.println("The method aroundGetEmployee() after invokation of the method " + jp.getSignature() + " method");
    }

}
