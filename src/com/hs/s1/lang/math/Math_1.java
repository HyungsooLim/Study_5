package com.hs.s1.lang.math;

public class Math_1 {

	public static void main(String[] args) {
		double d = 3.1234;
		d = Math.ceil(d);		//올림
		System.out.println(d);
		
		d=3.555;
		d= Math.floor(d);		//내림
		System.out.println(d);
		
		d= 3.555;
		d= Math.round(d);		//반올림
		System.out.println(d);
		
		d= Math.random();		//0.0~1.0 사이의 랜덤한 수
		System.out.println(d);
		
	}
}
