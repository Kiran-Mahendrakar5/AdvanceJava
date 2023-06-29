package com.xworkz.mack;

public class ConstructorChainig {
	
	public ConstructorChainig() {
		System.out.println("its defoult constructor");
	}
	public ConstructorChainig(int number) {
		this('A');
		System.out.println("byte no");
	}
	public ConstructorChainig(String name) {
		this();
		System.out.println("name");
	}
	public ConstructorChainig(boolean trueorfalse) {
		this("kiran");
		System.out.println("deer has tree legs");
	}
	public ConstructorChainig (char letter) {
		this(true);
	System.out.println("starting letter of kiran");
		
	}
	public static void main(String[] args) {
		ConstructorChainig ref = new ConstructorChainig(1234);
		
	}

}
