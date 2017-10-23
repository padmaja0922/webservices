package com.bcj.corejava.classes.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 */

/**
 * @author siva
 *
 */
public class FrequancyFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
				HashMap<String, Integer> ages = new HashMap<String, Integer>();
				ages.put("Alyssa", 22);
				ages.put("Char", 25);
				ages.put("Dan", 25);
				ages.put("Jeff", 20);
				ages.put("Kasey", 20);
				ages.put("Kim", 20);
				ages.put("Morgran", 25);
				ages.put("Ryan", 25);
				ages.put("Stef", 22);
				rarest(ages);

			}

			private static void rarest(HashMap<String, Integer> map) {
				// TODO Auto-generated method stub

				Map<Integer, Integer> frqncy = new HashMap<Integer, Integer>();
			
				for (String key : map.keySet()) {
					if (!frqncy.containsKey(map.get(key))) {
						frqncy.put(map.get(key), 1);
						
				
						
					} else {
						frqncy.put(map.get(key), frqncy.get(map.get(key)) + 1);
					}
				}
				
			
				

				Set set=frqncy.entrySet();
				Iterator itr=set.iterator();
				
				while(itr.hasNext())
					System.out.println(itr.next());

	}

}
