package com.mimaraslan.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotIstisnaSonrasiVazifelerAfterThrowing  {

	
	@AfterThrowing (pointcut =  "execution(* com.mimaraslan.model.Personel.adiSoyadiKontrolEt(..)) ")
	public void istisnaSonrasi(JoinPoint joinPoint)  {
		System.out.println("====METOT ISTISNA SONRASI=====");
		System.out.println("----METOD ADI: " + joinPoint.getSignature().getName() );
	}
	
	

}
