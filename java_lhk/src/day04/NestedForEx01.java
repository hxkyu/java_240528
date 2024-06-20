package day04;

public class NestedForEx01 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하세요.
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ...
		 * 2 X 9 = 18
		 * 반복회수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 2 X i = (2*i)를 출력
		 * 반복문 종료 후 : 없음
		 * */
	/*	for(int i = 2; i <=9; i++) {
			System.out.println("[" + i + "단]");
		for(int j=1; j<=9; j++) {
			System.out.println(i + "X" + j + "=" + (i*j));
		}
		}
	}
	*/
	int num = 3;
	for(num = 2; num <= 9; num++) {
		System.out.println(num + "단");
		for(int i = 1; i<= 9; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
   	}
  }

 } 
}