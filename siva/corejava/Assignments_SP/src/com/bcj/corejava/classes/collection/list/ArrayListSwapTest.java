package com.bcj.corejava.classes.collection.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListSwapTest {

	@Test
	public void test() {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("u");
		al.add("v");
		assertEquals(Arrays.asList("v","u"), ArrayListSwap.reverseOddAndEvenList(al));
	}

}
