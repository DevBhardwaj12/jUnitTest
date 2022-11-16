package jUnitTestPackage;
//devBhardwaj_E21CSEU0275

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStr {

	@Test
	public void test() {
			jUnitFunctions obj = new jUnitFunctions();
	        String first = "xyz";
	        String second = "abc";
	        assertEquals("xyzabc",obj.add_str(first,second));
	        
	}
	@Test
	public void test1() {
			jUnitFunctions obj = new jUnitFunctions();
	        String first = "xyz";
	        String second = "abc";
	       
	        assertEquals("abcxyz",obj.add_str(first,second));
	}

}
