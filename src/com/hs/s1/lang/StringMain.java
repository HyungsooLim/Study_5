package com.hs.s1.lang;

public class StringMain {

	public static void main(String[] args) {
		//primitive
		int num = 10;
		
		//reference
		//new 생성자
		String s1 = "messi";
		String s2 = new String();
		String s3 = new String("Hello World"); //-> 같은 코드
		
		//charAt 호출하고 결과물 출력
		char ch = s3.charAt(1);
		System.out.println(ch);
		System.out.println("------------------");
		StringEx1 stringEx1 = new StringEx1();
//		stringEx1.ex1();
//		stringEx1.ex2();
		
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("-------------------");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		System.out.println("-------------------");
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
		
		MyClass m1 = new MyClass();
		m1.num=1;
		m1.name="iu";
		
		MyClass m2 = new MyClass();
		m2.num=1;
		m2.name="iu";
		
		System.out.println(m1 == m2); //false
		System.out.println(m1.equals(m2));//false -> true
//									  \ 풀어쓴것
//									Object obj = m2;
//									MyClass m3 = (MyClass)obj;
//									m3.name;
	}
}
