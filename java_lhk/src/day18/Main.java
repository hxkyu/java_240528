package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Main {
	//어려운 버전
	/* 일정을 관리하는 프로그램을 작성하세요.
	 * -----------------
	 * 어려운 버전 : 여러 사람의 일정을 관리하는 프로그램
	 * -----------------
	 * 메인 메뉴
	 * 1. 회원 관리
	 * 2. 일정관리 
	 * 3. 프로그램 종료
	 * -----------------
	 * 메뉴 선택 : 1
	 * -----------------
	 * 회원 메뉴
	 * 1. 회원 추가
	 * 2. 회원 수정
	 * 3. 회원 삭제
	 * 4. 이전으로
	 * -----------------
	 * 메뉴 선택 : 1
	 * -----------------
	 * 추가할 회원 정보 입력
	 * 아이디 : abc123 
	 * 이름 : 홍길동
	 * -----------------
	 * 회원이 추가됐습니다.
	 * -----------------
	 * 회원 메뉴
	 * 1. 회원 추가
	 * 2. 회원 수정
	 * 3. 회원 삭제
	 * 4. 이전으로
	 * -----------------
	 * 메뉴 선택 : 2
	 * -----------------
	 * 아이디 : abc123
	 * -----------------
	 * 수정할 이름 : 고길동
	 * -----------------
	 * 회원 정보를 수정했습니다.
	 * -----------------
	 * 회원 메뉴
	 * 1. 회원 추가
	 * 2. 회원 수정
	 * 3. 회원 삭제
	 * 4. 이전으로
	 * -----------------
	 * 메뉴 선택 : 3
	 * -----------------
	 * 아이디 : abc123
	 * -----------------
	 * 회원 정보를 삭제했습니다.
	 *  -----------------
	 * 회원 메뉴
	 * 1. 회원 추가
	 * 2. 회원 수정
	 * 3. 회원 삭제
	 * 4. 이전으로
	 * -----------------
	 * 메뉴 선택 : 4
	 * -----------------
	 * 메인 메뉴
	 * 1. 회원 관리
	 * 2. 일정관리 
	 * 3. 프로그램 종료
	 * -----------------
	 * 메뉴 선택 : 2
	 * -----------------
	 * 아이디 : admin
	 * -----------------
	 * 등록되지 않은 회원입니다.
	 * -----------------
	 * 메인 메뉴
	 * 1. 회원 관리
	 * 2. 일정관리 
	 * 3. 프로그램 종료
	 * -----------------
	 * 메뉴 선택 : 2
	 * -----------------
	 * 아이디 : asd123
	 * -----------------
	 * 일정 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 이전으로
	 * 메뉴 선택 : 
	 * -----------------
	 * 쉬운 버전과 동일
	 * */
		
	//쉬운버전
	/* 일정을 관리하는 프로그램을 작성하세요.
	 * -----------------
	 * 쉬운 버전 : 한사람의 일정을 관리하는 프로그램
	 * -----------------
	 * 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 1
	 * -----------------
	 * 날짜(yyyy-MM-dd hh:mm) : 2024-06-21 17:50
	 * 일정 : 퇴근
	 * 상세 : 없음
	 * -----------------
	 * 일정이 추가되었습니다.
	 * -----------------
	 * 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 2
	 * -----------------
	 * 날짜(yyyy-MM-dd) : 2024-06-21
	 * -----------------
	 * 2024-06-21 일정 리스트
	 * -----------------
	 * 1. 2024-06-21 17:50 퇴근 없음
	 * -----------------
	 * 수정할 일정 선택 : 1
	 * -----------------
	 * 날짜(yyyy-MM-dd hh:mm) : 2024-06-21 17:51
	 * 일정 : 퇴근
	 * 상세 : 없음
	 * -----------------
	 * 수정이 완료 되었습니다.
	 * -----------------
	 * 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 3
	 * -----------------
	 * 날짜(yyyy-MM-dd) : 2024-06-21
	 * -----------------
	 * 2024-06-21 일정 리스트
	 * -----------------
	 * 1. 2024-06-21 17:50 퇴근 없음
	 * -----------------
	 * 삭제할 일정 선택 : 1
	 * -----------------
	 * 삭제되었습니다.
	 * -----------------
	 * 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 4
	 * -----------------
	 * 날짜(yyyy-MM-dd) : 2024-06-21
	 * -----------------
	 * 2024-06-21 일정 리스트
	 * -----------------
	 * 1. 2024-06-21 17:50 퇴근 없음
	 * -----------------
	 * 메뉴로 가시려면 엔터를 입력하세요.
	 * -----------------
	 * 메뉴
	 * 1. 일정 추가
	 * 2. 일정 수정
	 * 3. 일정 삭제
	 * 4. 일정 확인
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 5
	 * -----------------
	 * 프로그램을 종료합니다.
	 * -----------------
	 * */
	
	//클래스(정적) 멤버 변수로 Scanner를 만들면 어디에서든 매개변수로 넘기지 않고 사용가능하다 
	public static Scanner scan = new Scanner(System.in);
	private static List<Schedule> list = new ArrayList<Schedule>();//리스트생성
	
	private static final int INSERT = 1; //static 공통적인 값을 가지는 속성이 있을경우
	private static final int UPDATE = 2;
	private static final int DELETE = 3;
	private static final int SEARCH = 4;
	private static final int EXIT = 5;
	
	public static void main(String[] args) {
		
		int menu = 0;

		do {
			//메뉴 출력
			System.out.println("-----------");
			System.out.print("메뉴\n"
					+ "1. 일정 추가\n"
					+ "2. 일정 수정\n"
					+ "3. 일정 삭제\n"
					+ "4. 일정 확인\n"
					+ "5. 프로그램 종료\n"
					+ "메뉴 선택 : ");
			menu = scan.nextInt();
			
			//선택한 메뉴에 따른 기능 실행
			switch(menu){
			case 1:
				//System.out.println("일정 추가");
				//날짜, 이름, 상세를 입력받고
				System.out.println("날짜 : ");
				scan.nextLine();//엔터지우기
				String date = scan.nextLine();
				System.out.println("이름 : ");
				String name = scan.nextLine();
				System.out.println("상세 : ");
				String detail = scan.nextLine();
				
				//날짜, 이름, 상세를 이용해서 객체를 생성한후
				Schedule s = new Schedule(date, name, detail); 
				
				//객체를 리스트에 추가 클래스명 객체명 = new 클래스명();
				list.add(s);
				
				System.out.println(list.toString());
				
				
				break;
			case 2:
				System.out.println("일정 수정");
				break;
			case 3:
				System.out.println("일정 삭제");
				break;
			case 4:
				System.out.println("일정 확인");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				 System.err.println("잘못된 메뉴입니다.");
			}
		}while(menu != EXIT);
	}
	


	

}


@Data
@AllArgsConstructor
class Schedule{
	private String Date; //날짜
	private String Name; //이름
	private String Detail; //상세
	
	@Override
	public String toString() {
		return "날짜 : "  + Date + ", 일정 : " + Name + ", 상세 : " + Detail;
	}
}
