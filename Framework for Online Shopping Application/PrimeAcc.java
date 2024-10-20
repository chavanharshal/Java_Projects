package com.tns.GoShopping_framework;

public  class PrimeAcc extends ShopAcc{
	public static boolean isprime;
	float deliveryCharges;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.setIsprime(isprime);
	}
	
	 void bookProduct(float charges) {

			System.out.println("Charges are: "+charges);
		
	 }

		@Override
		public String toString() {
			System.out.println("\n Dear Prime User ... ") ;
			System.out.println("Your account Number is " + (getAccNo()) + " & Your Name is " + getAccNm());
			return "\n";

		}

	public boolean isIsprime() {
		return isprime;
	}

	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
}
