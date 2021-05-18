package com.hs.s1.lang;

import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		// 파일명 확장자 포함 입력
		// ex) test.jpg, test.txt
		// jpg, gif, png 이미지파일
		// 이미지파일 여부 판단 후 출력
		// test.jpg는 이미지 파일
		// test.txt는 이미지파일 X

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();
		String[] images = { "jpg", "gif", "png" };
		int dotNum = fileName.lastIndexOf(".");
		String fileType = fileName.substring(dotNum + 1).toLowerCase();

		boolean check = false; // true 이미지, false 다른파일
		for (int i = 0; i < images.length; i++) {
			if (fileType.equals(images[i])) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println(fileName + "는 이미지 파일");
		}else {
			System.out.println(fileName + "는 이미지 파일 X");
		}

	}

}
