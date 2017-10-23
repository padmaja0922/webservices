package com.bcj.corejava.classes.collection.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DoubleListTest {

	@Test
	public void test() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("u");
		assertEquals(Arrays.asList("u","u"), DoubleList.copyContent(al));
	}

}
