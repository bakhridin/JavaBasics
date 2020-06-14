package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// widening,happens implicitly
		double d=10;
		System.out.println(d);
		
		//Narrowing,explicitly implementing
		
		int i=(int)10.99;
		
		System.out.println(i);
		
		//-128 to 127
		byte b=(byte)1284;
		
		System.out.println(b);
		
		b=(byte)350;
		System.out.println(b);
		
		b%=256;
		System.out.println(b);
	

	}

}
