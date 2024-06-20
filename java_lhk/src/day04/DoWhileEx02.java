package day04;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {
		// y를 입력하면 종료하는 코드를 작성하세요
		int menu;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("메뉴");
			System.out.println("1. 프로그램 실행");
			System.out.println("2. 프로그램 저장");
			System.out.println("3. 프로그램 불러오기");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
		}while(menu != 4);
		System.out.println("프로그램을 종료합니다.");
	}

}