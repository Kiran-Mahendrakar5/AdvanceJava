package com.xworkz.mack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excution {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream ref = new FileInputStream("‪C:\\Users\\Lenovo\\Desktop\\codes");
			System.out.println("hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
