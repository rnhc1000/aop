package br.dev.ferreiras.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
//	@Before("execution(public void br.dev.ferreiras.aop.dao.AccountDAO.addAccount())")
//	@Before("execution(public void add*(*))")
//	@Before("execution(* br.dev.ferreiras.aop.*.*.add*(br.dev.ferreiras.aop.entities.Account))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====================>>> Executing @Before on addAccount()");
//	}
	@Pointcut("execution(* br.dev.ferreiras.aop.*.*.add*(br.dev.ferreiras.aop.entities.Account))")
	public void forDaoPackage() {
	}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====================>>> Executing @Before on addAccount()");
	}

}
