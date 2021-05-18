package com.hs.s1.lang;

import java.util.Scanner;

public class StringEx1 {

	private Scanner sc;
	
	public StringEx1() {
		sc = new Scanner(System.in);
	}
	
	//method명 ex1
	//주민번호입력
	//성별 판별
	public void ex1() {
		System.out.println("주민번호 입력");
		String num = sc.next();
		if(num.charAt(6)=='1' || num.charAt(6)=='3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
	}
	
	//method명 ex2
	//스캐너 이용해서 문자 하나 입력 받아서 (char) 대입 출력 method
	public void ex2() {
		System.out.println("문자 하나 입력");
		//String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(ch);
	}
	
	
	
	
}
