package jUnitTestPackage;
//devBhardwaj_E21CSEU0275

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddInt {

	@Test
	public void test() {
	        jUnitFunctions obj = new jUnitFunctions();
	        int a = 50;
	        int b = 50;
	        assertEquals(100,obj.add_num(a,b));

}
	@Test
	public void test2() {
	        jUnitFunctions obj = new jUnitFunctions();
	        int a = 50;
	        int b = 50;
	        assertEquals(1,obj.add_num(a, b));

}
}
