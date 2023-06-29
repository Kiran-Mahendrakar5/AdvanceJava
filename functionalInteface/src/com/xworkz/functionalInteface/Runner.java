package com.xworkz.functionalInteface;

public class Runner {

	public static void main(String[] args) {

		Aeroplane ref = () -> {
			System.out.println("carriedPassengers");
		};
		ref.carriedPassengers();

		System.out.println("..............................");

		Ship ref1 = () -> {
			System.out.println("tranportion");

		};
		ref1.transportation();
		System.out.println("..............................");
		JatAirways ref2 = () -> {
			System.out.println("saveTime");

		};
		ref2.saveTime();
		System.out.println("...............................");
	}

}
