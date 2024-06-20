package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		/*UpDown 게임에 다음 기능을 추가해주세요
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 정수 입력 : 50
		 * DOWN!
		 * 정수 입력 : 30
		 * UP!
		 * 정답입니다.
		 * 맞힌 횟수는 3회입니다.
		 * 기록이 등록됩니다.
		 * 메뉴 
		 * 1. 플레이 
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 1.플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 프로그램을 종료합니다.
		 * */
		
	//변수 선언
	Scanner scan = new Scanner(System.in);
	//1~100사이의 랜덤한 수를 생성
	int min = 1, max = 100; //랜덤 수 범위 1~100
	int num = 0;//사용자 입력 정수를 받을 변수
	int menu; //메뉴 입력받을 변수
	
	int count = 0; //몇번만에 게임 맞추는지 횟수담는 변수
	int [] record = new int[5];
	int recordCount = 0;
	
	
	//선택한 메뉴가 3이 아닐때 실행되는 반복문
	//반복문
	do {
		
		//메뉴 출력
		System.out.println("MENU");
		System.out.println("1.플레이");
		System.out.println("2.기록확인");
		System.out.println("3.종료");
		//메뉴 받기
		System.out.print("메뉴 선택 : ");
		//Scanner를 이용하여 메뉴를 입력
		menu = scan.nextInt();//스캔받아서 저장
		
		//선택한 메뉴에 따른 기능 실행
		switch(menu) {
		//선택한 메뉴가 1이면 플레이 문구 출력하는 코드 작성(게임 플레이하는 코드 작성)
		case 1:
			int random = (int)(Math.random() * (max - min + 1 ) + min);//랜덤한 수 받는 변수
			System.out.println(random);

			count = 0; //게임 시작전 초기화 처리

			do {
				//Scanner를 이용하여 정수를 입력 / 정수 입력 : 안내문구 출력
				System.out.println("입력 : ");
				num = scan.nextInt();//스캔받아서 저장
			
				//입력한 횟수를 1증가
				count++;
			
			//입력한 값이 랜덤한 수와 같지 않으면 반복
			if(num > random) {
				//입력한 값이 랜덤한 값보다 크면 DOWN이라고 출력하고 
				System.out.println("Down!");
			}else if(num < random) {
				//입력한 값이 랜덤한 값보다 작으면 UP이라고 출력하고
				System.out.println("Up!");
			}else {
				//같으면 정답입니다를 출력하고 입력한 횟수를 출력
				System.out.println("정답!");
				System.out.println("맞힌 횟수는" + count + "회 입니다.");
			}
			}while(random != num);
			//사용자가 랜덤한 수를 맞추지 못하면 계속 실행
			//기록의 개수가 5개 미만이면  기록을 등록
			if(recordCount < record.length) {
				//기록을 등록
				//recordCount번지에 저장하고 recordCount를 1 증가
				record[recordCount++] = count;
			}
			//아니면 내 기록이 5등보다 좋은지 비교해서 좋으면 기록을 등록
			else if (record[recordCount - 1] > count){
				//기록을등록
				//마지막번지에 내 기록을 등록
				record[recordCount - 1] = count;
			}

			//정렬
			//Arrays.sort를 이용하여 0번지부터 recordCount번지전까지 정렬
			//0번지는 포함, recordCount번지는 포함을 안하고 앞 번지까지
			Arrays.sort(record, 0, recordCount);
			System.out.println(Arrays.toString(record));
			
			System.out.println("기록 : " + count);
			
			System.out.println("플레이");

			break;

				
				
				

		//선택한 메뉴가 2이면 (기록 확인 문구 출력하는 코드 작성)하는 코드 작성
		case 2:
			if(recordCount == 0) {
				System.out.println("등록된 기록이 없습니다.");
				break;
			}
			//record에 있는 기록들을 recordCount개만큼 순서대로 출력
			/* 반복횟수 : i는 0부터 recordCount보다 작을 때까지 1씩 증가
			 * 규칙성 : i+1.횟수를 출력
			 * 반복문 종료 후 : 없음*/
			for(int i = 0; i < recordCount; i++) {
				System.out.println(i+1 + "." +record[i] + "회");
			}
			break;
		//선택한 메뉴가 3이면 프로그램 종료 문구 출력하는 코드 작성
		case 3:
			System.out.println("프로그램을 종료합니다");
			break;
		//아니면 잘못된 메뉴 문구 출력하는 코드 작성
		default:
			System.err.println("잘못된 메뉴입니다.");
		}
        //메뉴가 3과 같지 않으면 계속 반복
		}while(menu !=3); 
	}

}
		




