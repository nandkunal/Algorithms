package com.recursion.tests;

import org.junit.Before;
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

}
