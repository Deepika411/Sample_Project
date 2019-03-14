package org.test;



public class Sample {
	public Sample() {
		this(10);
		System.out.println("constructor");
		
	}

	public Sample(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
	}
	
	
	
	 
	}
	



