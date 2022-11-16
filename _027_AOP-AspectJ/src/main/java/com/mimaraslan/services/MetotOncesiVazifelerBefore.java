package com.mimaraslan.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MetotOncesiVazifelerBefore  {

	
    @Before(value = "execution(* com.mimaraslan.model.Personel.*(..)) ")
	public void ilkGorev(JoinPoint joinPoint)  {
		System.out.println("\n+++++METOTTAN ONCE+++++");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
	}

	

}
