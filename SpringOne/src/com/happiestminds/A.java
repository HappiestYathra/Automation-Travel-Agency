package com.happiestminds;

public class A {
	private B b;		
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
				
	public A()
	{
		System.out.println("heloo");
	}
	public void print()
	{
		System.out.println("A is printing");
	}
	public void display()
	{
		b.print();
		print();
		
	}
}
