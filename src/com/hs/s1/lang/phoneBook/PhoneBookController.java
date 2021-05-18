package com.hs.s1.lang.phoneBook;

import java.util.Scanner;

public class PhoneBookController {
	private Scanner sc;
	private PhoneBookInfo phoneBookInfo;
	private PhoneBookView phoneBookView;
	private PhoneBookDTO phoneBookDTO;
	
	public PhoneBookController() {
		sc = new Scanner(System.in);
		phoneBookInfo = new PhoneBookInfo();
		phoneBookView = new PhoneBookView();
		phoneBookDTO = new PhoneBookDTO();
	}

	public void start() {
		PhoneBookDTO[] phoneBookDTOs = null;
		boolean check = true;
		while(check) {
		System.out.println("1. PhoneBook 초기화");
		System.out.println("2. PhoneBook 전체출력");
		System.out.println("3. PhoneBook 데이터 검색");
		System.out.println("4. PhoneBook 데이터 추가");
		System.out.println("5. PhoneBook 데이터 삭제");
		System.out.println("6. 프로그램 종료");
		int select = sc.nextInt();
			switch(select) {
			case 1:
				phoneBookDTOs=phoneBookInfo.makePhoneBook();
				break;
			case 2:
				phoneBookView.view(phoneBookDTOs);
				break;
			case 3:
				phoneBookDTO=phoneBookInfo.searchPhoneBook(phoneBookDTOs);
				if(phoneBookDTO != null) {	
					phoneBookView.view(phoneBookDTO);
				}else {
					phoneBookView.view("검색 정보 없음");
				}
				break;
			case 4:
				phoneBookDTOs=phoneBookInfo.addPhoneBook(phoneBookDTOs);
				break;
			case 5:
				phoneBookDTOs=phoneBookInfo.deletePhoneBook(phoneBookDTOs);
				break;
			case 6:
				System.out.println("---프로그램 종료---");
				check = false;
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
}
