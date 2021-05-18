package com.hs.s1.lang.phoneBook;

public class PhoneBookMain {

	public static void main(String[] args) {
		//Class 개인적으로 만들어서
		//1. PhoneBook 초기화
		//2. PhoneBook 전체출력
		//3. PhoneBook 이름으로 검색, 출력 -----필수
		//4. PhoneBook 데이터 추가(이름, 전화번호, 나이, 메모)
		//5. PhoneBook 데이터 삭제(이름으로 검색 후 삭제)
		//6. 프로그램 종료
		PhoneBookController phoneBookController = new PhoneBookController();
		phoneBookController.start();
		
		
		
	}
}
