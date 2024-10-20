package com.tns.GoShopping_application;

import com.tns.GoShopping_framework.NormalAcc;
import com.tns.GoShopping_framework.PrimeAcc;
import com.tns.GoShopping_framework.ShopAcc;
import com.tns.GoShopping_framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc(++accNo, accNm, charges, isPrime);
	
		System.out.println(" \n Welcome to Prime  Account  transaction Portal ");
	
		gsprime.toString();
		gsprime.bookProduct(1000);
		
		return gsprime;
		
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(++accNo, accNm, charges, deliveryCharges);
		
		System.out.println(" \n Welcome to Normal Account transaction Portal ");
		
		gsnormal.toString();
		gsnormal.bookProduct(1000);
		
		return gsnormal;
	}	
}
