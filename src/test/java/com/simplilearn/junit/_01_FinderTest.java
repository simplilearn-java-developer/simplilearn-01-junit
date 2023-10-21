package com.simplilearn.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class _01_FinderTest {

	_01_Finder finder;
	
	@BeforeAll
	void initialize() {
		/*
		 * The methods with @BeforeAll are executed ONLY one time before the tests.
		 * 
		 * For instance:
		 *   If our tests use a DB, we can create the connection here.
		 *   If our tests use a file, we can open the file here.
		 */
		
		System.out.println("@BeforeAll: Finder Initialized");
		finder = new _01_Finder();
	}
	
	@Test
	void testFindMaxPositive() {
		
        int[] arr = {1,3,4,2};

        assertEquals(4, this.finder.findMax(arr));
        assertNotEquals(Integer.MIN_VALUE, this.finder.findMax(arr));
	}

	@Test
	void testFindMaxNegative() {
		
		int[] arr = {-12,-1,-3,-4,-2};
		
		assertEquals(-1, this.finder.findMax(arr));
		assertNotEquals(Integer.MIN_VALUE, this.finder.findMax(arr));
	}

	@Test
	void testFindMaxMixedNumbers() {
		
		int[] arr = {-12,7,-3,0,-2};
		
		assertEquals(7, this.finder.findMax(arr));
		assertNotEquals(Integer.MIN_VALUE, this.finder.findMax(arr));
	}
}
