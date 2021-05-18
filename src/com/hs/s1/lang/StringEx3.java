package com.hs.s1.lang;

public class StringEx3 {

	public static void main(String[] args) {

		// String str1 = new String("Hello World")
		String str1 = "Hello World";
		String str2 = null;

		str2 = str1.replace('l', 'A');
		System.out.println(str1);
		System.out.println(str2);

		str2 = str1.replace("World", "IU");
		System.out.println(str1);
		System.out.println(str2);

		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(str1.toString());
		System.out.println(str1);
		System.out.println("-------------------------");

		str1 = "iu";
		str2 = "i u "; // 앞뒤만 공백제거, 중간은 제거X
		str2 = str2.replace(" ", ""); // 중간 공백제거는 replace로
		str2 = str2.trim();
		System.out.println(str1.equals(str2));
		System.out.println("-------------------------");

		int num = 10;
		String str3 = String.valueOf(num);
		System.out.println(str3);
		
		str3 = "Hello World";
		//subString 사용, 출력
		String str4 = str3.substring(0, 5);
		System.out.println(str4);
		
	}

}
