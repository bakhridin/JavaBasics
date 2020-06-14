package ReviewClasses;

public class TestAc {

	public static void main(String[] args) {
		Account at=new Account();
	    at.setAcc_no(7560504000l);
	    at.setName("Sumair");
	    at.setEmail("sumair@syntax.com");
	    at.setAmount(50000.0);
	    System.out.println(at.getAcc_no()+" "+at.getName()+" "+at.getEmail()+" "+at.getAmount());

	}

}
