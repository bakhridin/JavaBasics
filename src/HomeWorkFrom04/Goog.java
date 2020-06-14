package HomeWorkFrom04;

public class Goog {
	int ImpId;
	double salary;
	
	String name,lastName,title;
	
	
	void working() {
		System.out.println(name+lastName+" is working "+title+" Almond Company and his profit "+salary);
	}

	public static void main(String[] args) {
		
		Goog prof=new Goog();
		prof.name="John";
		prof.lastName="Smith";
		prof.title="CEO";
		prof.salary=100000;
		
		prof.working();
			

	}

}
