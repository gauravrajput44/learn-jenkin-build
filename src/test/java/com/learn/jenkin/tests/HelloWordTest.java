package com.learn.jenkin.tests;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class HelloWordTest {
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before all the @Test methods");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after all @Test methods");
	}
		

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before the first @Test method in JUnit test class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after all the @Test methods in the JUnit test class");
	}
	
	@Test
	public void testCaseOne() {
		System.out.println("I am inside first test case");
		Assert.assertTrue("Values are equal", 1==1);
	}
		
	@Test
	public void testCaseTwo() {
		System.out.println("I am inside second test case");
		Assert.assertTrue("Values are equal", 2==2);
	}
}
