package com.javaex.ex03;

public class MyListApp {
	public static void main(String[] args) {
		Point p01 = new Point(4,7);
		Point p02 = new Point(8,17);
		
		Circle c01 = new Circle(5);
		
		MyList<Point> pList = new MyList<Point>();
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.get(0).toString()); // 오버라이딩(object로 관리하면서 circle, point는 가려진 상태) 
		System.out.println(pList.get(0).getX()); // 제네릭 써서 object가 아니라 Point로 감. -> 형변환 없이 Point 클래스 메소드 사용 가능.
		System.out.println(pList.toString());
		
		MyList<Circle> cList = new MyList<Circle>();
		cList.add(c01);
		// cList.add(p01); -> 제네릭 써서 못들어가게 되어 있어서 오류 남.
		
		System.out.println(cList.toString());
		
	}

}
