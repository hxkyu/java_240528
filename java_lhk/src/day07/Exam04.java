package day07;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 01~03기능을 합쳐서 다음기능을 구현하세요
		/*
		 * 다음 메뉴를 출력하고 메뉴를 선택하면 안내 문구를 출력하는 코드를 작성하세요.
	 * 메뉴
	 * 1. 추가
	 * 2. 검색
	 * 3. 종료
	 * 메뉴 선택 : 1
	 * ----------
	 * 단어 입력 (종료: -1) : abc
	 * 단어를 추가했습니다. / 단어를 추가하지 못했습니다.
	 * ----------
	 * 메뉴
	 * 1. 추가
	 * 2. 검색
	 * 3. 종료
	 * 메뉴 선택 : 2
	 * ----------
	 * 검색했습니다.
	 * ----------
	 * 메뉴
	 * 1. 추가
	 * 2. 검색
	 * 3. 종료
	 * 메뉴 선택 : 0
	 * ----------
	 * 잘못된 메뉴입니다.
	 * ----------
	 * 메뉴
	 * 1. 추가
	 * 2. 검색
	 * 3. 종료
	 * 메뉴 선택 : 3
	 * ----------
	 * 프로그램을 종료합니다.
	 * ----------
	 */
		Scanner scan = new Scanner(System.in);
		String [] list = new String[2];
		int menu;
		
		String word;//추가 검색 기능에서 입력할 단어를 저장하는 변수
		int count = 0; //추가된 단어의 개수
		boolean result; // 검색할 때 있다 없다를 확인할 변수 
		
		

		do {
			System.out.println("메뉴");
			System.out.println("1. 추가");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			
			
			// switch문으로 작성한 예제
			System.out.println("switch문으로 작성한 예제");
			switch(menu){
			case 1:
				System.out.println("----------");
				System.out.println("추가했습니다.");
				System.out.println("----------");
				break;
			case 2:
				System.out.println("----------");
				System.out.println("검색했습니다.");
				System.out.println("----------");
				break;
			case 3:
				System.out.println("----------");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("----------");
				break;
			default:
				System.out.println("----------");
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("----------");
				break;
			}
			
			
			
			// if문으로 작성한 예제
			System.out.println("if문으로 작성한 예제");
			if(menu == 1) {
				System.out.println("----------");
				System.out.println("추가했습니다.");
				System.out.println("----------");
				break;
			}else if(menu == 2) {
				System.out.println("----------");
				System.out.println("검색했습니다.");
				System.out.println("----------");
				break;
			}else if(menu == 3) {
				System.out.println("----------");
				System.out.println("종료합니다.");
				System.out.println("----------");
				break;
				
			}else {
				System.out.println("----------");
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("----------");
			}
			
			
		}while(menu != 3);

	}

}
