package com.bcj.corejava.classes.collection.map;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 */

/**
 * @author siva
 *
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> city=new HashMap<String,String>();
city.put("John","Dallas");
city.put("Babbar","NewYork city");
city.put("Akbar","Houston");
city.put("Rizwan","Dallas");
city.put("Jorge","Paris");
city.put("Roshan","Dallas");
city.put("Sujit","Houston");

cityCount(city);
}

	public static void cityCount(HashMap<String,String> city)
	{
	
		HashMap<String,Integer> frqncy = new HashMap<String,Integer>();
		for(String str:city.keySet())
		{
			if(!frqncy.containsKey(city.get(str))){
				frqncy.put(city.get(str), 1);
			
			}
			else 
       frqncy.put(city.get(str),frqncy.get(city.get(str))+1 );	
		
		}
		Set set=frqncy.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}}
