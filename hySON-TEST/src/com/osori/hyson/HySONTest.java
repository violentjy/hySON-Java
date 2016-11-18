package com.osori.hyson;

import static org.junit.Assert.*;

import org.junit.Test;

public class HySONTest {

	/** String Array Parsing test **/
	
	@Test
	public void tesParseEmptyStringArray() {
		String jsonString = "[]";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		String[] results = hySon.getArrayString(jsonString);
		assertEquals(0, results.length);
	}
	
	@Test
	public void tesParseStringArray() {
		String jsonString = "[\"a\", \"b\", \"c\"]}";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		String[] results = null;

		results = hySon.getArrayString(jsonString);
		
		assertEquals(3, results.length);
		assertEquals("a", results[0]);
		assertEquals("b", results[1]);
		assertEquals("c", results[2]);
	}
	

	@Test
	public void testParseWithConstructor() {
		String jsonString = "[\"a\", \"b\", \"c\"]}";
		HySON hySon = new HySON(jsonString);
		
		String[] results = null;

		results = hySon.getArrayString(jsonString);
		
		assertEquals(3, results.length);
		assertEquals("a", results[0]);
		assertEquals("b", results[1]);
		assertEquals("c", results[2]);
	}

	/** Boolean Array Parsing test **/
	
	@Test
	public void tesParseEmptBooleanArray() {
		String jsonString = "[]";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		Boolean[] results = hySon.getArrayBoolean(jsonString);
		assertEquals(0, results.length);
	}
	
	@Test
	public void tesParseBooleanArray() {
		String jsonString = "[\"true\", \"true\", \"false\"]}";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		Boolean[] results = null;

		results = hySon.getArrayBoolean(jsonString);
		
		assertEquals(3, results.length);
		assertTrue(results[0]);
		assertTrue(results[1]);
		assertFalse(results[2]);
	}
	
	@Test
	public void testParseBooleanWithConstructor() {
		String jsonString = "[\"true\", \"true\", \"false\"]}";
		HySON hySon = new HySON(jsonString);
		
		Boolean[] results = null;

		results = hySon.getArrayBoolean(jsonString);
		
		assertEquals(3, results.length);
		assertTrue(results[0]);
		assertTrue(results[1]);
		assertFalse(results[2]);
	}
	
	/** integer Array Parsing Test **/
	@Test
	public void testParseEmptIntArray() {
		String jsonString = "[]";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		int[] results = hySon.getArrayInt(jsonString);
		assertEquals(0, results.length);
	}
		
	@Test
	public void testParseIntArray() {
		String jsonString = "[\"1\", \"2\", \"3\"]}";
		HySON hySon = new HySON();
		hySon.parse(jsonString);
		
		int[] results = null;

		results = hySon.getArrayInt(jsonString);
		
		assertEquals(3, results.length);
		assertEquals(1, results[0]);
		assertEquals(2, results[1]);
		assertEquals(3, results[2]);
	}
	
	@Test
	public void testParseIntWithConstructor() {
		String jsonString = "[\"10\", \"20\", \"30\"]}";
		HySON hySon = new HySON(jsonString);
		
		int[] results = null;

		results = hySon.getArrayInt(jsonString);
		
		assertEquals(3, results.length);
		assertEquals(10, results[0]);
		assertEquals(20, results[1]);
		assertEquals(30, results[2]);
	}
}
