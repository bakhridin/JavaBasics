package com.syntax.class26;

public class Registration1 {
	
	private String email,userName,password;
	
	
	
	public void setEmail(String email) {
		if(email.contains("yahoo") && !email.isEmpty() && email.length()>4) {
			this.email =email;
		}else {
			System.out.println("Must be yahoo");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setuserName(String userName) {
		if(!userName.isEmpty()) {
			this.userName=userName;
		}
		else {
			System.out.println("Not working");
		}
		
	}
	public String getuserName() {
		return userName;
	}
	
	
	
	public static void main(String[] args) {
		
		Registration1 rg=new Registration1();
		rg.setEmail("register@.yahoo");
		System.out.println(rg.getEmail());
		
		rg.setuserName("Bokhtar");
		System.out.println(rg.getuserName());
		
	}
	

}
