package com.hs.s1.lang;

import java.util.Scanner;

public class StringEx2 {
	
	private String str;
	private int money;
	Scanner sc;
	
	public StringEx2() {
		sc = new Scanner(System.in);
	}
	//ex1 method
	//문자열 입력
	//전보 : 1글자당 100원		5글자 -> 500원
	//최종 금액 출력
	public void ex1() {
		System.out.println("문자열 입력");
		str = sc.next();
		int length = str.length();
		money = length*100;
		System.out.println(money);
	}
	
	//ex2
	//문자열 입력 길게			ex) Hello World
	//문자 1글자 입력			ex) l
	//입력받은 글자의 갯수 출력	ex) 3개
//	public void ex2() {
//		System.out.println("문자열 입력");
//		str = sc.next();
//		System.out.println("검색할 글자 입력");
//		String searchStr = sc.next();
//		char search = (char)searchStr;
//		int idx=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) == searchStr.charAt(0)) {
//				char str.charAt(i)= searchStr;
//			}
//		}
//	}

	
}
