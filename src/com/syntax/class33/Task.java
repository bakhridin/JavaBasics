package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Input a non-negative integer:");
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Your input is mismatched.");
				in.next();
				continue;
			}
			if (n < 0) {
				System.out.println("You negative value is not valid.");
				continue;
			}
			break;
		}

	}

}
