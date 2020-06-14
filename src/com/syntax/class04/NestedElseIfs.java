 package com.syntax.class04;

public class NestedElseIfs {

	public static void main(String[] args) {
	/*if student completed a quiz we will check for a score
	 * if score>90-->great job
	 * if score>80-->well done 
	 * if score>70-->yiu could have done better
	 * if stuent did not completed the quiz-->not good
	 * please do homework on time
	 */
		
	boolean quizCompleted=true;
	int score=86;
	
	if(quizCompleted) {System.out.println("Lets check your score");
	if(score>90) {System.out.println("Great job you study a lot");}
	else if(score>80) {System.out.println("Well done");}
	else if(score>70) {System.out.println("You could have done bette");}
	
	else {System.out.println("You faild");}
	
	
	
	
	}

	 else {System.out.println("Please do HW ontime");} 
	}

}
