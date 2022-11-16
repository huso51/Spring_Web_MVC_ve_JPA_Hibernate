package com.mimaraslan.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotOncesiVeSonrasiVazifelerAround  {

	 @Around(value = "execution(* com.mimaraslan.model.Personel.*(..)) ")
		public void kusatmaMetodu(ProceedingJoinPoint joinPoint) throws Throwable  {
			System.out.println("\n+++++METOTTAN ONCE+++++");
			System.out.println("----METOD ADI: " + joinPoint.getSignature().getName());
			joinPoint.proceed();
			System.out.println("====METOT SONRASI=====");
			
		}

}
