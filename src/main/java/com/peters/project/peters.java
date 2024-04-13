package com.peters.project;

	public class peters{
	int a=60;
	static int c = 90;
	static void student(){
	    System.out.println("method of static");
	    System.out.println(c);
	}
	public void frame(){
	    int i = 85;
	    System.out.println("method of instance");
	    System.out.println(i);
	    System.out.println(a);

	}
	public static void main(String[] args) {
	    student();
	    peters obj = new peters();
	    obj.frame();
	}
	}

