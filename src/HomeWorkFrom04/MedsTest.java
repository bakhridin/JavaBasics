package HomeWorkFrom04;

public class MedsTest {
	//
	void sayWelcome() {
		for(int i=0;i<=3;i++) {
			System.out.print("Welcome"+" ");
		}
	}
	//
	void sayAnithing(String word,int time) {
		for(int i=0;i<=time;i++) {
			System.out.println(word);
		}
	}
	//
	void isItRaining(boolean IsRain){
		if(IsRain) {
			System.out.println("It is raining stay home");
		}else {
			System.out.println("Go to the park");
		}
	}
	//
	void evenOdd(int a) {
		if(a%2==0) {
			System.out.println(a+" Is even");
		}else {
			System.out.println(a+" Is odd");
		}
	}
	//
	void isLarge(int a, int b) {
		if(a>b) {
			System.out.println(a+" is large number");
		}else {
			System.out.println(b+" is large");
		}
	}
	//
	void isPalindrome(String word) {
		char []array=word.toCharArray();
		String revers="";
		for(int i=array.length-1;i>=0;i--) {
			revers+=array[i];
			
		}
		if(revers.equalsIgnoreCase(word)) {
			System.out.println("The word is palindrome");
		}else {
			System.out.println("Word is not palindrome");
		}
	}
	//
	void sayHello(String country) {
		switch(country.toLowerCase()) {
		case "rusia":
			System.out.println("Privet");
			break;
		case "usa":
			System.out.println("Hello");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		default:
			System.out.println("Wrong language");
		
		}
	}
	
	
	

	public static void main(String[] args) {
		
		MedsTest wel=new MedsTest();
        //
		wel.sayWelcome();
		//
	    wel.sayAnithing("Hello", 4);	
		//
	    wel.isItRaining(true);
	    wel.isItRaining(false);
	    //
	    wel.evenOdd(10);
		wel.evenOdd(9);
		//
		wel.isLarge(10, 8);
		wel.isLarge(8, 9);
		//
		wel.isPalindrome("Madam");
		wel.isPalindrome("Myword");
		//
		wel.sayHello("rusia");
		wel.sayHello("TAJIKISTAN");
		wel.sayHello("usa");
		
		
	}

}
