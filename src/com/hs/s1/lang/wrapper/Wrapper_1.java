package com.hs.s1.lang.wrapper;

public class Wrapper_1 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Double.BYTES);
		System.out.println("----------------------------");
		Integer num1 = new Integer(10);
		
		System.out.println(num);
		System.out.println(num1.intValue());
		System.out.println("----------------------------");
		String str="20";
		num1 = new Integer(str);
		num = num1.intValue();
		System.out.println(num);
		System.out.println("=============================");
		str = "3000";
		//parseInt 사용
		int num2 = Integer.parseInt(str);
		System.out.println(num2);

		
	}
}
