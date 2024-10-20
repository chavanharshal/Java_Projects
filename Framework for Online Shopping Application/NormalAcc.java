package com.tns.GoShopping_framework;

public class NormalAcc extends ShopAcc
{
 protected static float deliveryCharge=50;
 
public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
	super(accNo, accNm, charges);
	this.deliveryCharge = deliveryCharge;
}

void bookProduct(float charges) {
	System.out.println("Charges are:"+deliveryCharge);
	
}

@Override
public String toString() {
	System.out.println("\n Dear Normal User ... ") ;
	System.out.println("Your account Number is " + (getAccNo()) + " & Your Name is " + getAccNm());
	return "\n";

}

public float getDeliveryCharge() {
	return deliveryCharge;
}

public void setDeliveryCharge(float deliveryCharge) {
	this.deliveryCharge = deliveryCharge;
}
}
