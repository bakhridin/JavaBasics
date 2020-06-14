package com.syntax.class22;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank(700.0);
		double fee=bank.chargeFee();
		System.out.println(fee);
		
		BOA boa=new BOA(700.0);
		fee=boa.chargeFee();
		System.out.println(fee);

		
		PNC pnc=new PNC(700.0);
		fee=pnc.chargeFee();
		System.out.println(fee);
		
		TD td=new TD(700.0);
		fee=td.chargeFee();
		System.out.println(fee);
	}

}
