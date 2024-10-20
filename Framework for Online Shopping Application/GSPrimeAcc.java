package com.tns.GoShopping_application;

import com.tns.GoShopping_framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float Charges=0;
	
	
	public float getCharges() {
		return Charges;
	}

	public GSPrimeAcc(int accNo, String accNm, float Charges, Boolean isprime) {
		super(accNo, accNm, Charges, isprime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("\n Your Product Charges are: "+charges);
		
	}

	@Override
	
	public String toString() {
		System.out.println("\n Dear Prime User ... ") ;
		System.out.println("Your account is created with Number:" + (getAccNo()) + " & Your Name is: " + getAccNm());
		return "\n";

	}
	
}
