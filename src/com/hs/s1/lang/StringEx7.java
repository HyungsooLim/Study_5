package com.hs.s1.lang;

public class StringEx7 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		str1 = str1+str2;
		System.out.println(str1);
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world2");
		
		sb.reverse();
		
		
		System.out.println(sb);
		
		sb.append(str1);
		sb.append(str2);
		System.out.println(sb);
		
	}
}
