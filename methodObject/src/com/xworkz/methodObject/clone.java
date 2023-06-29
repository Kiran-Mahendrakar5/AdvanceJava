package com.xworkz.methodObject;

public class clone {

	int rollno;
	String name;

	clone(int roolno, String name) {
		this.rollno = roolno;
		this.name = name;

	}

	public Object Clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static void main(String[] args) {
		
		
		
			try {
				clone s1 = new clone(101, "kiran");
				clone s2 = (clone) s1.Clone();
				System.out.println(s1.rollno+" "+s1.name);
				System.out.println(s2.rollno+" "+s2.name);
				
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
			
			

		

	}

}
