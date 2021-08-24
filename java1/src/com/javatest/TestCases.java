package com.javatest;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCases {
	@BeforeAll
	public static void m1() {
		System.out.println("Executed BeforeALL and once");
	}
	@AfterAll
	public static void m2() {
		System.out.println("Execute AfterALL and once");
	}
	@AfterEach
	public  void m3() {
		System.out.println("Execute AfterEach testcase ");
	}
	@BeforeEach
	public  void m4() {
		System.out.println("Execute BeforeEach testcase ");
	}
	@Test
	public void testAdd()
	{
		System.out.println("test1");
		int addition=CalculatorTest.add(123, 124);
		
		assertEquals(247,addition);
	}
	@Test
	public void testAddTrainer()
	{
		int result=CalculatorTest.addTrainer(111,"sandeep");
	String oldName=CalculatorTest.updateTrainer(111,"pratheek");
		assertEquals("sandeep",oldName);
		assertEquals(1,result);
				
	}
	
	@Test
	public void testRemoveTrainer()
	{
		String result=CalculatorTest.removeTrainer(111);
	
		//assertEquals("sandeep",oldName);
		assertEquals("pratheek",result);
				
	}
	//@Test
	@Ignore
	public void testdiv()
	{
		System.out.println("test3");
		int result=CalculatorTest.div(12,2);
		
		assertEquals(6,result);
	}
}