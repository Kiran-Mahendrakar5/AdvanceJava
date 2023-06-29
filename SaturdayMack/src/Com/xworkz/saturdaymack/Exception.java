package Com.xworkz.saturdaymack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream ref = new FileInputStream("‪C:\\Users\\Lenovo\\Desktop\\codes\\MyCode.java");
			System.out.println("hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("flow going");
		}
	}

}
