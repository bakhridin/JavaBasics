package com.syntax.class27;

public abstract class Food {
	
	public abstract void cook();
	public abstract void test();
	public abstract void cost();

}
class Kebab extends Food{

	@Override
	public void cook() {
		System.out.println("Kebab cooks long time");
		
	}

	@Override
	public void test() {
		System.out.println("Kebab tests delicous");
		
	}

	@Override
	public void cost() {
		System.out.println("Kebab costs expensive");
		
	}
}
	class Plow extends Food{

		@Override
		public void cook() {
			System.out.println("For coocking Plow you must be expert");
			
		}

		@Override
		public void test() {
			System.out.println("Plow tests uniqe");
			
		}

		@Override
		public void cost() {
			System.out.println("Plow not expensive like kebab");
			
		}
		
	}
	class Burger extends Food{

		@Override
		public void cook() {
			System.out.println("Burger is not coocking food");
			
		}

		@Override
		public void test() {
			System.out.println("Burger testing depends from brend");
			
		}

		@Override
		public void cost() {
			System.out.println("Burger costs not exoensive too");
			
		}
		
	}
	

