package com.recursion.impl;

import com.recursion.intf.TowerOfHannoi;

public class TowerOfHannoiImpl implements TowerOfHannoi {

	@Override
	public void displayMinimumMovements(int n, char src, char target, char aux) {
		displayMovements(n, src, target, aux);
		
	}

	@Override
	public int getCountOfMinimumMovements(int n) {
		return calculateMinimumMovements(n);
	}
	
	private void displayMovements(int n,char src,char target,char aux){
		if(n<=0)
			return;
		displayMovements(n-1, src, aux, target);
		System.out.println("Moving discs from "+src+" --> "+target);
		displayMovements(n-1, aux, target, src);
		
	}
	
	private int calculateMinimumMovements(int n){
		if(n<=0)
			return 0;
		if(n==1){
			return 1;
		}
		return 2*calculateMinimumMovements(n-1)+1;
	}

}
