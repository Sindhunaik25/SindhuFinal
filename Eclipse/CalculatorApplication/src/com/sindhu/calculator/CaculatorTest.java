package com.sindhu.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CaculatorTest {
	SimpleCalculator simple=null;
	@Before
	public void test1()
	{
simple=new SimpleCalculator(50,10);
	}
	@After
public	void after(){
		simple=null;
	}
	@Test
	public void test2() {
		assertEquals(60,simple.add(),0);
	//assertEquals(Expected output,actual input,difference)
	
	assertEquals(5,simple.division(),0);
	}
	
	@Test
	public void test3(){
		assertEquals(40,simple.subtract(),0);
	}
	
	@Ignore
	public void test4(){
		assertEquals(500,simple.multiplication(),0);
		
	}
	
}
