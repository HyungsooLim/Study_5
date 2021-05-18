package com.hs.s1.lang.phoneBook;

public class PhoneBookView {
	
	public void view(String str) {
		System.out.println("===================================");
		System.out.println(str);
		System.out.println("===================================");
	}

	public void view(PhoneBookDTO[] ar) {
		System.out.print("이름\t");
		System.out.print("전화번호\t\t");
		System.out.print("나이\t");
		System.out.println("메모\t");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i].getName()+"\t");
			System.out.print(ar[i].getPhoneNumber()+"\t");
			System.out.print(ar[i].getAge()+"\t");
			System.out.println(ar[i].getMemo()+"\t");
			System.out.println("------------------------------------------");
		}
	}
	
	public void view(PhoneBookDTO phoneBookDTO) {
		System.out.print("이름\t");
		System.out.print("전화번호\t\t");
		System.out.print("나이\t");
		System.out.println("메모\t");
		System.out.print(phoneBookDTO.getName()+"\t");
		System.out.print(phoneBookDTO.getPhoneNumber()+"\t");
		System.out.print(phoneBookDTO.getAge()+"\t");
		System.out.println(phoneBookDTO.getMemo()+"\t");
		System.out.println("------------------------------------------");
	}
	
	
}
