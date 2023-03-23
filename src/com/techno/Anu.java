package com.techno;
//overriding

public class Anu {
	public void go() {
		System.out.println("Super-go");
	}
}
class Usha extends Anu{
	public void go() {
		System.out.println("Sub-go");
	}
	public static void main(String[]args) {
		Usha a = new Usha();
		a.go();
	}
}
	
		
	


