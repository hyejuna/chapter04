package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		Point p01 = new Point(2,12);
		Point p02 = new Point(3,13);
		Point p03 = new Point(7,17);
		
		List<Point> pList = new ArrayList<Point>(); // implements 메소드가 interface 메소드로 오버라이딩 됨. 바꿀때 대비 공통으로 있는 애만 사용함. 바꾸기 쉽게 섞어쓰기
		//List<Point> pList = new LinkedList<Point>(); ->섞어쓰기 되어 있어서 interface에 있는 메소드만 사용했기 때문에 이부분만 바꾸면 ArrayList -> LinkedList로 변경 가능.
		
		pList.add(p01); // 배열에 주소 넣음
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("=======================");
		pList.remove(1);
		System.out.println(pList.size());
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.get(1).toString());
		
		System.out.println("=======================");
		pList.add(1, p02);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("=======================");
		System.out.println(pList.toString());
		
		System.out.println("=======================");
		//향상된 for문 (무조건 처음부터 끝까지!!)
		for(Point p : pList) // pList에 있는 주소를 Point p에 하나씩 담아서 읽음!
			System.out.println(p.getX());
		
		
		
		
		
		
		
		
	}

}
