package com.kh.practice.set.model.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{
	

	@Override
	public int compare(Lottery o1, Lottery o2) {
		int tree= o1.getName().compareTo(o2.getName());
		
		if(tree ==1) {
			 o1.getPhone().compareTo(o2.getPhone());
			tree=2;
		}
		return tree;
	}
	
}
