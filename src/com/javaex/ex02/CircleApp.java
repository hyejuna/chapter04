package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {

		Circle c01 = new Circle(3);
		Circle c02 = new Circle(6);
		
		CircleList cList = new CircleList();
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.get(1).getRadius());
		System.out.println(cList.size());
	}

}
