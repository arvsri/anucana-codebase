package com.anucana.web.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class GenericLogging {

	private static final String pointCutExclusions= "&& !execution(* com.anucana.validation.implementations.JSR303ValidatorFactoryBean.*(..))";
	
	@Before(value = "execution(* com.anucana..*.*(..)) " + pointCutExclusions)
	public void logBefore(JoinPoint joinPoint){
		Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		log.debug(" -> {} ( {} )", joinPoint.getSignature().getName(),joinPoint.getArgs());
	}
	
	
	@AfterReturning(value = "execution(* com.anucana..*.*(..)) " + pointCutExclusions, returning = "result")
	public void logAfter(JoinPoint joinPoint, Object result){
		Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		log.debug(" <- {}() : {} ",joinPoint.getSignature().getName(),result);
	}
	

	@AfterThrowing(value = "execution(* com.anucana..*.*(..)) " + pointCutExclusions, throwing = "ex")
	public void logOnException(JoinPoint joinPoint, Throwable ex){
		Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		log.error(" -- {}() : {} ",joinPoint.getSignature().getName(),ex);
	}
	
}
