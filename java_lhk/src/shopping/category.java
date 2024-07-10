package shopping;

public class category {

	public static void main(String[] args) {
		while(true) {
			printMenu(); 
			System.out.println("1. 상품/카테고리 관리");
			printMenu(); 
			System.out.println("1. 카테고리");
			System.out.println("2. 상품");
			System.out.println("0. 이전화면");
			printMenu();
			int cMenu = 0;
			try {
				System.out.println("메뉴 선택>>");
				cMenu = sc.nextint();
				sc.nextLine();
				if(cMenu == 1) {
				}
			}
			
		}

	}

	private static void printMenu() {
		System.out.println("-------------------");
		
	}

}

