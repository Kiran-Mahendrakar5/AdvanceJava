package com.xworkz.methodObject;

public class toString {
	
	int rollNo;
	String name;
	String city;
	
	public toString(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		
	}
	public String toString() {
		return rollNo+" "+name+" "+city;
	}
	public static void main(String[] args) {
		toString s1 =new toString(101,"kiran","bangalore");
		toString s2 =new toString(101,"kishan","hosadurga");
		System.out.println(s1);
		System.out.println(s2 );
	}
	
	

}
