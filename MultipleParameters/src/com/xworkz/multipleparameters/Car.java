package com.xworkz.multipleparameters;

import java.util.Comparator;

public interface Car extends Comparator<Integer> {
	
//	public void myCar();
	
//	public int myOwncar(int number);
	
//	public int myJeepCampass(Integer number,Integer number1);
	
	@Override
	public int compare(Integer o1, Integer o2);

}
