package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		// 구구단 2단을 출력하는 코드 for문
		/* 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 2 X i = 2 * i를 출력
		 * 반복 종료 후 : 없음
		 * */
		
		int i;
		for( i = 1; i < 10; i++){
			System.out.println("2*" + i + "=" + 2 * i );
		}

	}

}

/* 강사샘꺼
int num = 2;
for(int i = 1; i<=9; i++) {
	System.out.println(num + "X" + i + "=" + num * i);
 }
}*/
/*
public static void main(String[] args) {
	
	// y를 입력하면 중지하는 코드를 작성하세요.
	
	Scanner scan = new Scanner(System.in);
	char ch = 'a';
	
	while(true) {
		System.out.println("문자 입력 : ");
		ch = scan.next().charAt(0);
		
		if(ch == 'y') {
			System.out.println("y를 입력하셨습니다. 반복문을 빠져납니다.");
			break;
		}else {
			System.out.println(ch);
		}
	}

}*/