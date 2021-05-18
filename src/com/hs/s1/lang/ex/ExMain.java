package com.hs.s1.lang.ex;

public class ExMain {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		//t1과 t2를 담을 수 있는 배열 선언
		//상속과 다형성
		Object[] tests = new Object[2];
		tests[0]=t1;
		tests[1]=t2;
		
		System.out.println(((Test1)tests[0]).name);
		System.out.println(((Test2)tests[1]).age);
		
		tests = new Object[0];

		System.out.println(tests.length);
		System.out.println("===============================");
		ObjectArray objectArray = new ObjectArray();
		System.out.println(objectArray.ar.length);
		int size = objectArray.add(t1);
		size = objectArray.add(t2);
		
		System.out.println(objectArray.ar.length);
		
		
		
		
		
		
		
		
		
	}
}
