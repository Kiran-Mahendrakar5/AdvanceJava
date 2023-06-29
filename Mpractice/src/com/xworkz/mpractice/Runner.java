package com.xworkz.mpractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {

//		ArrayList<String> list = new ArrayList();
//		list.add("kiran");
//		list.add("Kishu");
//		list.add("karan");
//		list.add("kush");
//		list.add("kiran");
//
//		System.out.println(list);

		// output:-[kiran, Kishu, karan, kush, kiran]
//		*found in utilpackage
//		*maintain insertion order

//		LinkedList<String> link = new LinkedList<String>();
//		
//		link.add("elephants");
//		link.add("rabbit");
//		link.add("deer");
//		link.add("horse");
//		link.add("Ahorse");
//		
//	//	Collections.sort(link);
//		
//		System.out.println(link);

//		*out put :-[Ahorse, deer, elephants, horse, rabbit]
//		*linked list implements collection interface
//		*maintain insertion order

//		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		
//		hsh.put(1, "peacock");
//		hsh.put(2, "parrot");
//		hsh.put(3, "duck");
//		hsh.put(4, "pigeon");
//		
//		Set<Integer> key = hsh.keySet();
//		for(Integer keys:key) {
//			System.out.println(keys);
//			
//			System.out.println(hsh);

//			output:-1
//			{1=peacock, 2=parrot, 3=duck, 4=pigeon}
//			2
//			{1=peacock, 2=parrot, 3=duck, 4=pigeon}
//			3
//			{1=peacock, 2=parrot, 3=duck, 4=pigeon}
//			4
//			{1=peacock, 2=parrot, 3=duck, 4=pigeon}

//		HashSet<String> hash = new HashSet<String>();
//		
//		hash.add("doggg");
//		hash.add("catt");
//		hash.add("cow");
//		hash.add("horsee");
//		hash.add("horsee");
//		
//		for(String ref:hash) {
//			System.out.println(ref);
//		
//		}
//		output:-
//		catt
//		horsee
//		doggg
//		cow

//		*hash class implements set interface
//		*does not contain duplicate iteam

//		LinkedHashSet<String> lsh = new LinkedHashSet<String>();
//		
//		lsh.add("benz");
//		lsh.add("audi");
//		lsh.add("ertiga");
//		lsh.add("bmw");
//		lsh.add("bmw");
//		
//		for(String arr:lsh) {
//			System.out.println(arr);
//		}
//		output:-
//		benz
//		audi
//		ertiga
//		bmw

//		*linkedhashset class represents linkedlistimplements
//		maintain insertion order
//		does not contain duplicates

//		TreeSet<Integer> trs = new TreeSet<Integer>();
//		trs.add(3);
//		trs.add(4);
//		trs.add(8);
//		trs.add(12);
//		trs.add(21);
//		trs.add(2);
//		trs.add(1);
//		trs.add(1);
//		
//		for(Integer tre:trs) {
//			System.out.println(tre);
//		}

//		*output:-
//		1
//		2
//		3
//		4
//		8
//		12
//		21

//		*treeset implemets the set interface
//		*maintain acending order
//		*does contain duplicates

//		TreeSet<String> trs = new TreeSet<String>();
//		
//		trs.add("kiranmahendrakar");
//		trs.add("shoki");
//		trs.add("deepu");
//		trs.add("aish");
//		
//		for(String stg:trs) {
//			System.out.println(stg);
//		}

//		output:-
//		aish
//		deepu
//		kiranmahendrakar
		// shoki

//		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
//		hmap.put(4, "kiran");
//		hmap.put(2, "kishan");
//		hmap.put(3, "deepu");
//		hmap.put(1, "aishu");
//		hmap.put(5, "kishor");
//		hmap.put(5, "kumar");
//		
//		System.out.println(hmap.get(1));
//		System.out.println(hmap.get(2));
//		System.out.println(hmap.get(3));
//		System.out.println(hmap.get(4));
//		System.out.println(hmap.get(5));
//		System.out.println(hmap.get(5));

//		hmap.put(1, "kiran");
//		hmap.put(1, "kishan");
//		
//		System.out.println(hmap.get(1));

//		output:-
//	kiran
//		kishan
//		deepu
//		aishu
//		kishor
//		kishor
//		* HashMap maintains no order.
//		* HashMap may have one null key and multiple null values.

//		TreeMap<Integer,String> ths = new TreeMap<Integer,String>();
//		
//		ths.put(5, "ktm");
//		ths.put(2, "honda");
//		ths.put(4, "enfiled");
//		ths.put(3, "gt");
//		ths.put(1, "pulsar");
//		
//		for(int i=0; i<=5; i++) {
//			System.out.println(ths.get(i));
//		}
//		output:-
//		pulsar
//		honda
//		gt
//		enfiled
//		ktm

//		*TreeMap maintains ascending order
//		*TreeMap contains only unique elements

//		LinkedHashMap<Integer,String> link = new LinkedHashMap<Integer,String>();
//		link.put(1, "dell");
//		link.put(2, "lenovo");
//		link.put(5, "Ipad");
//		link.put(4, "hp");
//		link.put(3, "lg");
//		
//		for(int i=0; i<=5;i++) {
//			System.out.println(link.get(i));
//		}

//		output:-
//		dell
//		lenovo
//		lg
//		hp
//		Ipad

//		*LinkedHashMap maintains insertion order
//		*LinkedHashMap contains unique elements
//		*LinkedHashMap contains values based on the key

//	HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		
//		hsh.put(1, "Elephants");
//		hsh.put(2, "lion");
//		hsh.put(3, "cow");
//		hsh.put(4, "horse");
//		hsh.put(5, "tiger");
//		
//		Set<Integer> key = hsh.keySet();
//		System.out.println(key);
//		
//		
//		for(Integer ref:key) {
//			System.out.println(hsh.get(ref));
//		}
//		

//		output:-
//		[1, 2, 3, 4, 5]
//				Elephants
//				lion
//				cow
//				horse
//				tiger
//		* HashMap maintains no order.
//		* HashMap may have one null key and multiple null values

//	
//		Set<String> sss = new HashSet<String>();  
//		sss.add("kiran");
//		sss.add("kishannnn");
//		sss.add("deepuuu");
//		sss.add("aishu");
//		sss.add("aishu");
//		
//	//	System.out.println(sss);
//		
//		
//		Iterator<String> itr = sss.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}

//		output:-
//		aishu
//		kiran
//		deepuuu
//		kishannnn

//		LinkedHashSet<String> set=new LinkedHashSet<String>();
//		set.add("kiran");
//		set.add("kishan");
//		set.add("deepu");
//		set.add("aishu");
//		
//		
//		Iterator<String> its = set.iterator();
//		while(its.hasNext()) {
//			System.out.println(its.next());
//			  
//			
//			outpur:-
//			kiran
//			kishan
//			deepu
//			aishu
//		}

//		TreeSet<String> tree = new TreeSet<String>();
//		tree.add("mango");
//		tree.add("apple");
//		tree.add("grapes");
//		tree.add("lich");
//		tree.add("dragon");
//		
//	//	System.out.println(tree);
//		Iterator<String> its = tree.iterator();
//		while(its.hasNext()) {
//			System.out.println(its.next());
//		}
//		
//		output:-
//		apple
//		dragon
//		grapes
//		lich
//		mango

//		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		hsh.put(1, "dell");
//		hsh.put(2, "lenovo");
//		hsh.put(3, "ipad");
//		hsh.put(4, "hp");
//		hsh.put(5, "asus");

		// System.out.println(hsh);
		// output:-{1=dell, 2=lenovo, 3=ipad, 4=hp, 5=asus}
//		Set<Integer> key = hsh.keySet();
//		for(Integer keys:key) {
//			System.out.println(hsh.get(keys));
//		}
//		output:-
//		dell
//		lenovo
//		ipad
//		hp
//		asus

//		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		hsh.put(1, "dell");
//		hsh.put(2, "lenovo");
//		hsh.put(3, "ipad");
//		hsh.put(4, "hp");
//		hsh.put(1, "asus");//duplicates keys not allowed
//		
//		Set<Integer> key = hsh.keySet();
//		for(Integer keys:key) {
//			System.out.println(hsh.get(keys));
//		}

//		output:-
//		asus
//		lenovo
//		ipad
//		hp

		// removing
//		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		hsh.put(1, "dell");
//		hsh.put(2, "lenovo");
//		hsh.put(3, "ipad");
//		hsh.put(4, "hp");
//		hsh.put(5, "asus");//duplicates keys not allowed
//		
//		removing key&value
//       System.out.println(hsh.remove(1));
//       System.out.println(hsh.remove(2, "lenovo"));

		// replaceing
//		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
//		hsh.put(1, "dell");
//		hsh.put(2, "lenovo");
//		hsh.put(3, "ipad");
//		hsh.put(4, "hp");
//		hsh.put(5, "asus");
//		
//		System.out.println(hsh.replace(1, "dello"));
//		
//		System.out.println(hsh);

//		TreeSet<Integer> trr = new TreeSet<Integer>();
//		
//		trr.add(1);
//		trr.add(4);
//		trr.add(5);
//		trr.add(2);
//		trr.add(3);
//		trr.add(6);
//		
//		System.out.println(trr);

//		output:-[1, 2, 3, 4, 5, 6]

//		LinkedHashMap<Integer,String> link = new LinkedHashMap<Integer,String>();
//		
//		link.put(1, "asus");
//		link.put(2, "nokia");
//		link.put(3, "apple");
//		link.put(4, "oneplus");
//		link.put(5, "vivo");
//		
//		
//	//	System.out.println(link.get(1));
//		Set<Integer> key = link.keySet();
//		for(Integer keys:key) {
//			System.out.println(link.get(keys));
//		}
////		output:-
////		asus
////		nokia
////		apple
////		oneplus
////		vivo

//		LinkedHashMap<Integer, String> link = new LinkedHashMap<Integer, String>();
//
//		link.put(1, "asus");
//		link.put(2, "nokia");
//		link.put(3, "apple");
//		link.put(4, "oneplus");
//		link.put(5, "vivo");
//		link.put(5, "vivo");
//
//		boolean ref1 = link.containsValue(link);
//		System.out.println(ref1);

//		System.out.println(link.keySet());
//		[1, 2, 3, 4, 5]
//		System.out.println(link.values());
//		[asus, nokia, apple, oneplus, vivo]
//		System.out.println(link.containsKey(link));
//		false
		
//		HashSet<String> hash = new HashSet<String>();
//		LinkedHashSet<String> hash1 = new LinkedHashSet<String>();
//		
//		hash.add("kiran");
//		hash.add("kishan");
//		hash.add("Siddhu");
//		hash.add("Siddhu");
//		
//		for(String ref:hash) {
//			System.out.println(ref);
//		}
//		
//		hash1.add("deepu");
//		hash1.add("Aishu");
//		hash1.add("Srinivas");
//		hash1.add("Srinivas");
//		
//		
//		for(String refe:hash1) {
//			System.out.println(refe);
//			
//		}
//		output
//		kiran
//		kishan
//		Siddhu
//		deepu
//		Aishu
//		Srinivas
		
		
		

	}

}
