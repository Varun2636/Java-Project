package com.core.CyclicDI1;

public class A {

	
	
	private B b;

	static {
		System.out.println("A class is loaded");
	}
	
	public A()
	{
		System.out.println("Object is created for A");
	}
	
	
	

	public static class B {

		private A a;

		public static void main(String[]args) {
			System.out.println("B class is loaded");
		}
		
		public B()
		{
			System.out.println("Object is created for B");
		}
		
		public void setA(A a) {
			this.a = a;
		}
		
			
	}
	
	
	public void setB(B b) {
		this.b = b;
	}
	
	void show()
	{
		System.out.println("showing.....");
	}
	
	
}