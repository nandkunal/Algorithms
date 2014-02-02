package com.recursion.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.recursion.impl.TowerOfHannoiImpl;
import com.recursion.intf.TowerOfHannoi;

public class TestTowerOfHannoi {
	
	
	@Test
	
	public void testDisplayMinimumMovements(){
		int n = 2;
		char src = 'A';
		char aux='B';
		char target = 'C';
		TowerOfHannoi obj = new TowerOfHannoiImpl(); 
		obj.displayMinimumMovements(n, src, target, aux);
		
	}
	
	@Test 
	
	public void testCountMinimumMovements(){
		int n=3;
		TowerOfHannoi obj = new TowerOfHannoiImpl();
		//System.out.println(obj.getCountOfMinimumMovements(n) );
		assertEquals(7,obj.getCountOfMinimumMovements(n) );
	}

}
