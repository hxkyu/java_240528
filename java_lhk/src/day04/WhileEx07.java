package day04;

public class WhileEx07 {
	public static void main(String[] args) {
		/*4가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신인 수를 소수라고 함
		 * 1 :소수가 아님*
		 * 2 : 소수
		 * 4: 소수
		 * 3 : 소수가 아님
		 * 반복횟수: i는 1부터 4까지 1씩 증가
		 * 규칙성:1가 4의 약수이면 약수의 개수(count)를 1 증가
		 * 반복문 종료 후 :	약수의 개수가 2개이면 소수,
		 * 소수가 아님 */
		int num = 4; //4가 소수인지 아닌지 판별
		int i = 1;
		int count = 0;
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
				System.out.print(num + "는 소수");
		}
		else {
			System.out.print(num + "는 소수가 아님");
		}		
	}
}


//public static void main(String[] args) {
//	
//	/*
//	 * 12의 약수를 출력하는 코드를 작성하세요
//	 * 약수는 나누어서 나머지가 0이 되게 하는 수
//	 * 12의 약수 : 1, 2, 3, 4, 6, 12
//	 * 
//	 * 반복횟수 : i는 1부터 12까지 1씩 증가
//	 * 규칙성 : i가 12의 약수이면 i를 출력
//	 * 		=> 12를 i로 나누었을 때 나머지가 0과 같다면 i를 출력해라
//	 * 		=> 12 % i == 0이라는 조건을 만족하면 i를 출력
//	 * 반복문 종료 후 : 
//	 * */
//	
//	int i = 1;
//	int num = 12;
//	System.out.print(num + "의 약수 : ");
//	while(i <= num) {
//		if(num % i == 0) {
//			System.out.print(i + (i != num ? ", " : "\n")); // i != num ? ", " : "\n" = i가 num와 값이 같으면 ", "(콤마)를 아니면 "\n"(공백)을 출력해라.
//		}
//		i++;
//	}
//	
//}