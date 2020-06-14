package ReviewClasses;

public class abc {
	
//	static int countVowels(String s){
//	int sum=0;
//	  for(int i= 0;i<s.length();i++ ){
//	    char ch = s.charAt(i);
//	    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
//	      sum++;
//	    }
//	  } 
//		return sum;
//	  
//	
//	}
//	
//	//test case below (dont change):
//	public static void main(String[] args){
//		System.out.println(countVowels("obama")); //3
//		System.out.println(countVowels("happy friday! i love weekends")); //9
//	}
//
//}
//	// test case below (dont change):
//	

	//static String surround(String s,String search_term){
//	    String str="";
//	 
//	    for(int i=0;i<s.length();i++){
//	    str= s.replaceAll(search_term, ("("+search_term+")"));
//	  
//	    }
//	    return str;
//	    
//	  }
//		
//		
//			
//		
//		
//		//test case below (dont change):
//		public static void main(String[] args){
//			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
//			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
//		}
	public static void main(String[] args) {
		String str="Sunday for Java";
		char revers;
		
		for(int i=str.length()-1;i>-1;i--) {
			revers=str.charAt(i);
			System.out.print(revers);
			
		}
		System.out.println();
	}
	}