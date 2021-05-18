package com.hs.s1.lang.phoneBook;

import java.util.Scanner;

public class PhoneBookInfo {

	private String data;
	PhoneBookDTO[] phoneBookDTOs;
	private Scanner sc;
	private PhoneBookDTO phoneBookDTO;

	public PhoneBookInfo() {
		// 이름, 전화번호, 나이, 메모
		// Ver.1
		this.data = "messi-01011111111-33-forward";
		this.data = this.data + "+ronaldo+01022222222+36+forward";
		this.data = this.data + "-neuer+01033333333+34-goalkeeper";
		sc = new Scanner(System.in);
		phoneBookDTO = new PhoneBookDTO();
	}

	public PhoneBookDTO[] makePhoneBook() {
		int idx = 0;
		String[] parsed = this.data.split("[+-]");
		phoneBookDTOs = new PhoneBookDTO[parsed.length / 4];
		for (int i = 0; i < parsed.length; i++) {
			PhoneBookDTO phoneBookDTO = new PhoneBookDTO();
			phoneBookDTO.setName(parsed[i]);
			phoneBookDTO.setPhoneNumber(parsed[++i]);
			phoneBookDTO.setAge(parsed[++i]);
			phoneBookDTO.setMemo(parsed[++i]);
			phoneBookDTOs[idx] = phoneBookDTO;
			idx++;
		}
		return phoneBookDTOs;
	}

	public PhoneBookDTO searchPhoneBook(PhoneBookDTO[] ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();
		phoneBookDTO = null;
		for (int i = 0; i < ar.length; i++) {
			if (name.equals(ar[i].getName())) {
				phoneBookDTO = ar[i];
				break;
			}
		}
		return phoneBookDTO;
	}

	public PhoneBookDTO[] addPhoneBook(PhoneBookDTO[] phoneBookDTOs) {
		PhoneBookDTO[] ar = new PhoneBookDTO[phoneBookDTOs.length+1];
		for(int i=0;i<ar.length-1;i++) {
			ar[i]=phoneBookDTOs[i];
		}
		ar[phoneBookDTOs.length] = new PhoneBookDTO();
		System.out.println("추가할 이름 입력");
		ar[phoneBookDTOs.length].setName(sc.next());
		System.out.println("추가할 전화번호 입력");
		ar[phoneBookDTOs.length].setPhoneNumber(sc.next());
		System.out.println("추가할 나이 입력");
		ar[phoneBookDTOs.length].setAge(sc.next());
		System.out.println("추가할 메모 입력");
		ar[phoneBookDTOs.length].setMemo(sc.next());
		phoneBookDTOs = ar;
		return phoneBookDTOs;
	}
	
	public PhoneBookDTO[] deletePhoneBook(PhoneBookDTO[] phoneBookDTOs) {
		PhoneBookDTO[] ar = new PhoneBookDTO[phoneBookDTOs.length-1];
		System.out.println("삭제할 데이터 이름 입력");
		String name = sc.next();
		int idx=0;
		for(int i=0;i<phoneBookDTOs.length;i++) {
			if(name.equals(phoneBookDTOs[i].getName())) {
				continue;
			}
			ar[idx]=phoneBookDTOs[i];
			idx++;
		}
		phoneBookDTOs=ar;
		return phoneBookDTOs;
	}

}
