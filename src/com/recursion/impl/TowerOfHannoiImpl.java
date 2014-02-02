package com.recursion.impl;

import com.recursion.intf.TowerOfHannoi;

public class TowerOfHannoiImpl implements TowerOfHannoi {

	@Override
	public void displayMinimumMovements(int n, char src, char target, char aux) {
		displayMovements(n, src, target, aux);
		
	}

	@Override
	public int getCountOfMinimumMovements(int n) {
		return 0;
	}
	
	private void displayMovements(int n,char src,char target,char aux){
		if(n<=0)
			return;
		displayMovements(n-1, src, aux, target);
		System.out.println("Moving discs from "+src+" --> "+target);
		displayMovements(n-1, aux, target, src);
		
	}

}
