package com.xworkz.mobilemock;

public class NokiaImpl implements Mobile {

	@Override
	public void call() {
		System.out.println("calling");
		
	}

	@Override
	public void message() {
		System.out.println("messaging");
		
	}

	@Override
	public void satting() {
		System.out.println("allsatting");
		
	}

}
