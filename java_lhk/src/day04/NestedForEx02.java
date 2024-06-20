package day04;

public class NestedForEx02 {
	public static void main(String[] args) {
		 /*num가 소수인지..아닌지..
		  */
		int num = 3;
		int i, count = 0;
		for(num = 2; num <= 100; num++) {
			//num가 소수인지 아닌지 판별하는 코드
			for(i=1, count = 0; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(num + " ");//한줄확인 print
			}
		}
		
	}



}