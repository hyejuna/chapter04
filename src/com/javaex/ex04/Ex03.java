package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// HashSet을 이용해서 로또 자동생성기
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		for(int i=0; i<6; i = iSet.size()) {
			int num = (int)(Math.random()*45) +1;
			//System.out.println("생성된 숫자:"+num);
			iSet.add(num);	
		}
		
		for(Integer i : iSet) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		
		//강사님 코드
		
		Set<Integer> lSet = new HashSet<Integer>();
		
		while(true) {
			
			if(lSet.size() >= 6) {
				break;
			}
			
			int num = (int)(Math.random()*45) +1;
			//System.out.println("생성된 숫자:"+num);
			lSet.add(num); 	
		}
		
		for(int no : lSet) { //언박싱
			System.out.println(no);
		}
		
		
		
	}

}
