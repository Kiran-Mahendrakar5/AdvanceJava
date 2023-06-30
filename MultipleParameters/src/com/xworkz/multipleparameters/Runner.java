package com.xworkz.multipleparameters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

//		Car ref = () -> {
//			System.out.println("my car printing");
//		};
//		ref.myCar();

//		Car ref1 = (num) -> {
//			System.out.println("myowncar is printing");
//			return num;
//		};
//		ref1.myOwncar(12);

//		Car ref2 = (num,num1) ->{
//			System.out.println("myjeepcampass is printing");
//			System.out.println(num);
//			System.out.println(num1);
//			return num;
//		};
//		ref2.myJeepCampass(14, 21);

		List<Integer> list = new ArrayList<Integer>();

		list.add(45);
		list.add(67);
		list.add(12);
		list.add(21);
		list.add(23);

		list.forEach((ref) -> {
			System.out.println(ref);
		});

		Car comp = (o1, o2) -> {

			if (o1 > o2) {
				return 1;
			}
			return -1;
		};
		Collections.sort(list,comp);
		
		
		System.out.println("...................................");
		list.forEach((ref) -> {
			System.out.println(ref);
		});

	}

}
