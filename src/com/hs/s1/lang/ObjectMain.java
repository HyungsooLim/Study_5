package com.hs.s1.lang;

public class ObjectMain {

	public static void main(String[] args) {
		//클래스명 참조변수명 = new 생성자();
		Object obj = new Object();
		Object obj2 = new Object();
		//method 선언 공식
		//접근지정자 [그외지정자] returnType methodName([매개변수선언]){}
		
		
		//method 호출
		//참조변수명.method명()
		boolean check = obj.equals(obj);
		
		System.out.println(check);
		System.out.println(obj==obj2);
		System.out.println(obj==obj);
		System.out.println("-------------------------");
		
		String ts = obj.toString();
		System.out.println(ts);
		System.out.println(obj); // == obj.toString()
		System.out.println("-------------------------");
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
	}
}
