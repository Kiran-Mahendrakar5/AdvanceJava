package com.xworkz.methodObject;

public class multi extends Thread{

	public void run() {
		System.out.println("thread is running");

	}
	public static void main(String[] args) {
		multi mm = new multi();
		mm.start();
		
	}

}
