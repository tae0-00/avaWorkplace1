package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();
	
	public LotteryController() {
		
	}
	public boolean insertObject(Lottery l) {
		boolean b = true;
		if(b) {
			lottery.add(l);
			b=true;
		}else {
			b=false;
		}
		return b;
		//return lottery.add(l); 그냥 이렇게 해도 됨
	}
	public boolean deleteObject(Lottery l) {
		boolean b= true;
		if(b) {
		lottery.remove(l);
		 if(!(win.isEmpty())) {
			win.remove(l);
			b=true;
			}
		}else {
			b=false;
		}
		return b;
		
	}
	public HashSet<Lottery> winObject(){
		List <Lottery> lott = new ArrayList<Lottery>(lottery);
		Collections.shuffle(lott);
	
		if(lottery.size()<4) {
			return null;
		}
		
			for(int i=0; win.size()<4;i++) {
				win.add(lott.get(i));
				
	//	HashSet<Lottery> hlt= new  HashSet<Lottery>(lott);
//				return hlt;
//				}else {
//				}
			}
			return win;
	}
		
	public TreeSet<Lottery>sortedWinObject(){
		winObject();
//		if(!(win.isEmpty())){
//			Comparator<Lottery>comp= Collections.reverseOrder();
//			 TreeSet<Lottery> tc= new TreeSet<Lottery>(comp);
			 TreeSet<Lottery> set =new TreeSet<Lottery>(new SortedLottery());
			 set.addAll(win);
			 return set;
//		}else {
//			return null;
//		}
				
	}
	public boolean searchWinner(Lottery l) {
		boolean b= true;
		if(win.contains(l)) {
			b=true;
		}else {
			b= false;
		}
		return b;
	}
}
