package com.xworkz.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Alto");
		list.add("campass");
		list.add("alcazar");
		list.add("Ertiga");
		list.add("taigon");
		list.add("swift");
		list.add(" mercedes Benz");
		list.add("audi");
		list.add("suzuki etios");
		list.add("santro");
		list.add("duster");
		list.add("crista");
		list.add("fortuner");
		list.add("bmt");
		list.add("titanium");
		list.add("polo");
		list.add("hyundai");
		list.add("jeep");
		list.add("Toyota");
		list.add("Scorpio");
		list.add("Hector");
		
//		list.forEach((ref)-> {System.out.println(ref);});
		System.out.println("...............sorting.....................");
		Stream<String> stream = list.stream();
		list.forEach((ref)-> {System.out.println(ref);});
		
	List<String> listt = stream.sorted().collect(Collectors.toList());
	listt.forEach((ref)-> {System.out.println(ref);});
	System.out.println("..............filter......................");
	
	Stream<String> stream1 = list.stream();
	List<String> lowercase = stream1.map(k -> k.toLowerCase()).collect(Collectors.toList());
	lowercase.forEach((ref1)-> {System.out.println(ref1);});
	
	System.out.println("...............capital letter...............");
	Stream<String> stream2 = list.stream();
	Stream<String> filter =list.stream().filter(k ->k.startsWith("A")||k.startsWith("B")||k.startsWith("C")||k.startsWith("D")||
			k.startsWith("E")||k.startsWith("T")||k.startsWith("S"));
	filter.forEach((ref2)-> {System.out.println(ref2);});
	System.out.println("..... have space ...............");
	
	Stream<String> stream3 = list.stream();
	List<String> filter1 =  stream3.filter(k -> k.contains(" ")).collect(Collectors.toList());
	filter1.forEach((ref3)-> {System.out.println(ref3);});
	System.out.println("..... value which have m...............");
	
	Stream<String> stream4 = list.stream();
	List<String> contains = stream4.filter(k -> k.contains("m")).collect(Collectors.toList());
	contains.forEach((ref3)-> {System.out.println(ref3);});
	System.out.println("..... value which have i...............");
	
	Stream<String> stream5 = list.stream();
	List<String> containsi = stream5.filter(k -> k.contains("i")).collect(Collectors.toList());
	containsi.forEach((ref3)-> {System.out.println(ref3);});
	
	
	
	
	
	
	
	
	
		
	}

}
