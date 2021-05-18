package com.hs.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	Scanner sc;
	String[] ids;
	int[] intIds;
	StringBuffer sb;

	public Wrapper_ex1() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
	}

	// juminCheck
	// 주민번호 입력 ex)941224-1234567
	// 9 2 0 8 2 9 - 1 0 5 0 0 1 3(체크용번호)
//	 *2		3	4	5	6	7		8	9	2	3	4	5
//	  18 +  6 + 0 + 40 +12 +63		8 + 0 + 10 +0 + 0 + 5
//	 결과값 162
//	 162/11 = 14...8(나머지)
//	 11에서 나머지를 뺀 후 체크용 번호와 같으면 올바른 주민번호,
//	 11-8=3
//	 만약에 결과가 10이상이면 다시 10으로 나눈 나머지를 체크용 번호와 비교
//	 10/10 = 1...0(나머지)
	public void juminCheck() {

		System.out.println("주민번호 입력(- 포함)");
		String id = sc.next();
		id = id.replace("-", "");
		ids = id.split("");
		intIds = new int[ids.length];
		int num = 2;
		int sum = 0;
		for (int i = 0; i < ids.length; i++) {
			intIds[i] = Integer.parseInt(ids[i]);
			if (num <= 9) {
				sum = sum + intIds[i] * num;
				num++;
			} else if (num > 9) {
				num = 2;
				sum = sum + intIds[i] * num;
				num++;
			}
		}
//		for(int i=0;i<intIds.length;i++) {
//			System.out.println(intIds[i]);
//		}
		sum = sum - intIds[ids.length - 1] * (num - 1);
//		System.out.println(sum);

		if (11 - sum % 11 >= 10) {
			if ((11 - sum % 11) / 10 == intIds[ids.length - 1]) {
				System.out.println("주민번호 인증 성공");
			}
		} else {
			if (11 - sum % 11 == intIds[ids.length - 1]) {
				System.out.println("주민번호 인증 성공");
			}
		}
	} // method 끝

	// getAge
	// 주민번호 입력 001224-4234567
	// 나이를 출력
	// 태어난 계절 출력
	// 3~5 : 봄
	// 6~8 : 여름
	// 9~11 : 가을
	// 12~2 : 겨울

	public void getAge() {
		String idYear = null;
		System.out.println("주민번호 입력(- 포함)");
		String id = sc.next();
		id = id.replace("-", "");
		ids = id.split("");
		if (ids[7].equals("1") || ids[7].equals("2")) {
			sb.append("19");
			sb.append(ids[0]);
			sb.append(ids[1]);
			idYear = sb.toString();
		} else if (ids[7].equals("3") || ids[7].equals("4")) {
			sb.append("20");
			sb.append(ids[0]);
			sb.append(ids[1]);
			idYear = sb.toString();
		}
		int idIntYear = Integer.parseInt(idYear);
		int age = 2021 - idIntYear + 1;
		System.out.println("나이 : " + age);

		String idMonth = ids[2] + ids[3];
		int idIntMonth = Integer.parseInt(idMonth);
		if (idIntMonth > 2 && idIntMonth <= 5) {
			System.out.println("태어난 계절 : 봄");
		} else if (idIntMonth > 5 && idIntMonth <= 8) {
			System.out.println("태어난 계절 : 여름");
		} else if (idIntMonth > 8 && idIntMonth <= 11) {
			System.out.println("태어난 계절 : 가을");
		} else if (idIntMonth > 11 || idIntMonth <= 2) {
			System.out.println("태어난 계절 : 겨울");
		}

	}// method 끝

}
