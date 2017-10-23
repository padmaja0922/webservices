package com.bcj.corejava.classes.collection.set;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class SetIntersectionTest {

	@Test
	public void test() {
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		HashSet<Integer> set3=new HashSet<Integer>();
		set1.add(3); set2.add(3);
		set1.add(7); 
		set1.add(2); set2.add(2);
		set3.add(2);
		set3.add(3);
		assertEquals( set3,SetIntersection.countCommon(set1, set2));
	}

}
