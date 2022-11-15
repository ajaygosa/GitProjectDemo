package com.gitproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(101, "Anil");
		map.put(102, "puja");
		map.put(103, "jagruti");
		map.put(104, "Ajay");
		
		Set set = map.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Object key = itr.next();
			System.out.println("key is : "+key);
			System.out.println("value is : "+map.get(key));
		}
	}

}
