package com.mimaraslan.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotSonrasiVazifelerAfterReturning  {

	@AfterReturning (pointcut =  "execution(* com.mimaraslan.model.Personel.*(..)) ", returning = "sonuc")
	public void sonraCalis(JoinPoint joinPoint, Object sonuc)  {
		System.out.println("====METOT SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName()  + " GERI DONUS DEGERI: "+ sonuc );
	}

	
	

}
