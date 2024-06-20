package day04;

public class WhileEx09 {
	public static void main(String[] args) {
		/*a~z 출력(26개)
		 * 반복횟수 : i는 0부터 25까지 1씩 증가*/
		int i = 0;	
		while(i <= 25) {
			 System.out.println((char)('a'+i));
			 i++;

		}
		System.out.println();
		char ch ='A';
		while(ch <= 'z') {
			System.out.print(ch);
			ch++;
		}

	}

}