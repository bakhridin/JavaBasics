package com.syntax.class29;


abstract class Coverage{
	
	public void method() {
		System.out.println("Method of Coverage class");
	}
}

public abstract  class Insurance extends Coverage {
	String InsuranceName;
	
	Insurance(String InsuranceName){
		this.InsuranceName=InsuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
 class Car extends Insurance{
	 String carModel;
	 Car(String InsuranceName,String carModel) {
		super(InsuranceName);
		this.carModel=carModel;

	}
	@Override
	public void getQuote() {
		System.out.println("1600$ offered from "+InsuranceName+" for "+carModel);
		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Due to other offers "+InsuranceName+" offer for "+carModel+" is canceled");
		
	}

	
 }
class Pet extends Insurance{
    String petType;
	Pet(String InsuranceName,String petType) {
		super(InsuranceName);
		this.petType=petType;
	
	}
	@Override
	public void getQuote() {
		System.out.println("Offer to high for "+petType+" from "+InsuranceName);
		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Canceled due too high price");
		
	}
	
	
}
class Health extends Insurance{

	Health(String InsuranceName) {
		super(InsuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("Brown family got offer from "+InsuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Please contact customer service "+InsuranceName);
		
	}
	
}
	 
 
