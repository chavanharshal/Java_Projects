package com.tns.GoShopping_application;

import com.tns.GoShopping_framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	protected static  final float Charges = 1000.0f;
	protected static float deliveryCharge=100.0f;
	protected float TotalCharge=Charges+deliveryCharge;


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
   	
	public void bookProduct(float charges)
	{	
		System.out.println("\n Your Product Charges are: "+charges);
		System.out.println("\n Your Delivery Charges are: "+deliveryCharge);
		System.out.println("\n Your Total Charges are: "+TotalCharge);
	}


	@Override
	public String toString() {
		System.out.println("\nDear Normal User ... ") ;
		System.out.println("Your account is created with Number:" + (getAccNo()) + " & Your Name is: " + getAccNm());
		return "\n";

	}
}
