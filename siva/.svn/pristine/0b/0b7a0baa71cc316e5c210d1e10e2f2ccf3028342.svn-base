package com.bcj.corejava.classes.collection.set;

import java.util.HashSet;

/**
 * 
 */

/**
 * @author siva
 *
 */
public class SetIntersection {

	/**
	 * @param args
	 * printing the common elements in both sets
	 */
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		set1.add(3); set2.add(-5);
		set1.add(7); set2.add(15);
		set1.add(3); set2.add(2);
		set1.add(-1);set2.add(-1);
		set1.add(2); set2.add(7);
		set1.add(3); set2.add(15);
		set1.add(7); set2.add(36);
		set1.add(2);
		set1.add(15);
		set1.add(15);
		set1=countCommon( set1, set2);
for(int i:set1)
	System.out.println(i);
	}
public static HashSet<Integer> countCommon(HashSet<Integer> set1,HashSet<Integer> set2)
{
	set1.retainAll(set2);
	return set1;
	}
}
