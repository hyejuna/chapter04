package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		this.oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		T result = oArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}


	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}


	
	
	

}
