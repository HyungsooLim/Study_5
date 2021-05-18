package com.hs.s1.lang;

public class StringMain2 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//indexOf method 호출, 결과 출력
		int num = str.indexOf(100);
		System.out.println(num);
		
		num = str.indexOf(' ', 2);
		System.out.println(num);
		System.out.println("--------------------------");
		
		StringEx2 stringEx2 = new StringEx2();
		stringEx2.ex1();
		
	}
}
