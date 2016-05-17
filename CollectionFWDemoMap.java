package com.walmart.electronic.tv;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class CollectionFWDemoMap {

	public static void main(String[] args) {
		
		//Hashtable
		// 1. methods are synchronized ---> slow 
		//2. null k/values are not allowed ---> null pointer exception 
		
		Hashtable<Integer,Integer> sHashTable=new Hashtable<Integer,Integer>();	
		//sHashTable.put(null, null);
		sHashTable.put(120, 33443);
		sHashTable.put(88, 8788);
		sHashTable.put(14, 4555);
		
		Set<Integer> keySet1=sHashTable.keySet();
		
		for (Integer sId : keySet1) {
			System.out.println("hash table "+sHashTable.get(sId));
		
		}
		
		
		// HashMap
		// 1. methods are asynchronized ---> fast 
		//2. null k/values are  allowed 
		
		HashMap<Integer ,StudentBO> studentHashMAp=new HashMap<Integer, StudentBO>();
		StudentBO s1=new StudentBO();
		s1.setsId(120);
		s1.setSname(null);
		s1.setSaddress("ayyodya");
		
		studentHashMAp.put(120, s1);
		
		StudentBO s2=new StudentBO();
		s2.setsId(23);
		s2.setSname("seetha");
		s2.setSaddress("india");
		
		studentHashMAp.put(23, s2);
		StudentBO s3=new StudentBO();
		s3.setsId(90);
		s3.setSname("hanuma");
		s3.setSaddress("up");
		
		studentHashMAp.put(90, s3);
		studentHashMAp.put(null, null);
		
		
	Set<Integer> keySet=studentHashMAp.keySet();
		
	for (Integer sId : keySet) {
		StudentBO sBO=studentHashMAp.get(sId);
		if(sBO!=null){
		System.out.println(sBO.getSname());
		System.out.println(sBO.getSaddress());
		System.out.println(sBO.getsId());
		}

	}
	
		

	}

}
