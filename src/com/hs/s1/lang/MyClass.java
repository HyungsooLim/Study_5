package com.hs.s1.lang;

public class MyClass {

	int num;
	String name;

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		boolean check = false;
		MyClass my = (MyClass) obj;
		if (this.num == my.num && this.name.equals(my.name)) {
			check = true;
		}
		return check;
	}
}
