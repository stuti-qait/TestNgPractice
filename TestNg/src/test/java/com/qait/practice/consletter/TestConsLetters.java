package com.qait.practice.consletter;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.*;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import java.util.ArrayList;


public class TestConsLetters {

	@Test
	public void testLetters() {
		ConsLetters cons = new ConsLetters();
		ArrayList<String> InputList = new ArrayList<String>();
		ArrayList<String> expectedList = new ArrayList<String>();
		InputList.add("apple");
		InputList.add("banana");
		InputList.add("guava");
		
		expectedList.add("apple");
		
		ArrayList<String> result = cons.checkEquals(InputList);
		
		
		AssertJUnit.assertEquals( result, expectedList);
		
		
	}

	
}

	