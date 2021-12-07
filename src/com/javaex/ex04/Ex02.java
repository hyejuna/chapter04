package com.javaex.ex04;
//Set
import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(3);
		Integer i06 = new Integer(17);
		
		
		Set<Integer> iSet = new HashSet<Integer>(); // 제네릭엔 클래스만 가능
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //int -> Integer로 자동 박싱 됨
		iSet.add(i05); // 중복 값은 안들어감. -> 방번호가 아니라 데이터로 꺼내기 때문에 문제되서.
		iSet.add(i06); 
		
		iSet.remove(i03); // Integer는 실제 값으로도 지울 수 있음.  iSet.remove(7);
		
		System.out.println("갯수:" + iSet.size());
		
		for( Integer no : iSet) {
			System.out.println(no.toString());
		}
		
		
		
		
		
		//Point 관리
		System.out.println("=====================");
		
		Point p01 = new Point(3, 13);
		Point p02 = new Point(4, 14);
		Point p03 = new Point(5, 15);
		Point p04 = new Point(3, 13);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04); // 기본자료형 아니면 같다는 equals() 재정의 필요!
		
		pSet.remove(p04);
		
		System.out.println("갯수:" + pSet.size());
		
		for( Point p : pSet) {
			System.out.println(p.getX());
		}
		
		System.out.println(pSet.toString());
	}
}
