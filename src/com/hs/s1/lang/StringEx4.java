package com.hs.s1.lang;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		String str = "hello,world,My Country";
		//1.
		//str1 = "hello"
		//str2 = "world"
		int index = str.indexOf(",");
		String str1 = str.substring(0, index);
		int index2 = str.indexOf(",", index+1);
		String str2 = str.substring(index+1, index2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("----------------------");
		
		//2.
		//Scanner로 입력받은 문자열을
		//, 기준으로 잘라서 출력
		//ex) test,world
		//test
		//world
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		str = sc.next();
		boolean check = true;
		int startIndex=0;
		int lastIndex=0;
		while(check) {
			lastIndex = str.indexOf(",",startIndex);
			if(lastIndex==-1) {
				lastIndex = str.length();
				check=false;
			}
			str1 = str.substring(startIndex, lastIndex);
			System.out.println(str1);
			startIndex=lastIndex+1;
		}
	
		
		
	}
}
