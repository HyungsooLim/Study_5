package com.hs.s1.lang.ex;

public class ObjectArray {

	Object[] ar;
	
	public ObjectArray() {
		ar = new Object[0];
	}
	
	public int add(Object obj) {
		//받은 obj를 배열 ar에 추가
		Object[] ar1 = new Object[ar.length+1];
		for(int i=0;i<ar.length;i++) {
			ar1[i]=ar[i];
		}
		ar1[ar.length]=obj;
		ar=ar1;
		
		
		return ar.length;
	}
	
	//method : pop
	//배열의 길이 return
	//배열의 0번 index 지우는 효과
	public int pop() {
		
		return ar.length;
	}
	
	//method : shift
	//배열의 길이 return
	//배열의 마지막 index 지우는 효과
	
	
	
	//method : removeAll
	//return 없음
	//배열을 모두 지우는 효과
	
	
	
	//method : size
	//배열의 길이 return
	
}
