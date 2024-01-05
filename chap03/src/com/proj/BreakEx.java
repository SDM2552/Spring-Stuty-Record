package com.proj;

public class BreakEx {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if(i==55) {
//				System.out.println(i);
				break;
			}
			System.out.println(i); //문제: 숫자 몇을 출력할까요?
		}
		System.out.println("종료");
		
	}

}
