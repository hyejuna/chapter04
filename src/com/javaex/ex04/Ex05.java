package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>(); // String : key가 어떤 값 쓸껀지 Point : value 들어갈 클래스
		
		Point p01 = new Point(1, 11);
		Point p02 = new Point(2, 22);
		Point p03 = new Point(3, 33);
		
		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("권상우", p03); // 권상우 key의 값을 p03 주소로 수정!
		
		System.out.println(pMap.toString());
		
		//System.out.println(pMap.get("정우성").getX());
		//System.out.println(pMap.size());
		
		//key Set 구하기
		Set<String> keys = pMap.keySet();
		
		for(String key : keys) {
			System.out.println(pMap.get(key).getX());
		}
		
		/////////////////////////////////////////////////////
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("regDate", "2021-12-08");
		boardMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
	}

}
