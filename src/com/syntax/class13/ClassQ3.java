package com.syntax.class13;

public class ClassQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*  int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 10; i++) {
               fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("Here are the first 10 Fibonacci numbers:");
        for (int j = 0; j < 10; j++) {
               System.out.print(fib[j] + " ");
        }*/
		
	/*	int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 10; i++) {// to find rest fibonacci until 10
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int j = 0; j < 10; j++) {// number of index
			System.out.print(fib[j] + " ");
		}*/
		/*
		 * Write JP to print first 10 numbers of Fibonacci series
		 * 0 1 1 2 3 5 8
		 */
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
