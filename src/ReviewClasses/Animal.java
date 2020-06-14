package ReviewClasses;

public class Animal {
	 String str;
	  
	  public Animal(String str){
	    this.str=str;
	  }
	  public void eat(){
	    
	    
	  }
	  public void sleep(){
	    
	  }

}
class Cat extends Animal{
	public Cat(String str) {
		super(str);
		
	}
	
	  public void eat(){
	    System.out.println("Cat eats");
	  }
	  public void sleep(){
	    System.out.println("Cat sleeps a lot");
	  }
	}
	class Kitten1 extends Cat{
		public Kitten1(String str) {
			super(str);
			
		}
	  public void eat(){
	    System.out.println("kitten1 eats milk");
	  }
	  public void sleep(){
	    System.out.println("kitten1 sleeps a lot");
	  }
	}
	class Kitten2 extends Cat{
		public Kitten2(String str) {
			super(str);
			}
	  public void eat(){
	    System.out.println("kitten2 eats snack");
	  }
	   public void sleep(){
	    System.out.println("kitten2 sleeps a lot");
	  }
	}
	class Kitten3 extends Cat{
		public Kitten3(String str) {
			super(str);
			}
	  public void eat(){
	    System.out.println("kitten3 eats everything");
	  }
	    public void sleep(){
	    System.out.println("kitten3 sleeps a lot");
	  }
	}
