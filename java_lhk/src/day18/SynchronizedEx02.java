package day18;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEx02 {

   public static void main(String[] args) {
      // 은행 잔고를 통한 동기화 블록 예제
      BankBook2 bankBook = new BankBook2("홍길동",0);
      Customer c1 = new Customer("홍길동",bankBook);
      Customer c2 = new Customer("고길동",bankBook);
      
      Thread t1 = new Thread(()->c1.deposit(10000));
      Thread t2 = new Thread(()->c2.deposit(10000));
      
      t1.start();
      t2.start();
   }

}
@AllArgsConstructor
class Customer{
   private String name; // 고객은 이름을 가지고 있고
   private BankBook2 bankBook; // 통장을 가지고 있다.
   
   public void deposit(int money) {
	   System.out.println(name + "님이 입금중입니다.");
	   synchronized (bankBook){
		   
		   int balance = bankBook.getBalance(); // 통장 잔고를 가져옴.
		      bankBook.setBalance(balance + money);
		      
		      try {
		         Thread.sleep(2000); // 현재 스레드를 2초간 멈춤
		      } catch (InterruptedException e) {
		         e.printStackTrace();
		      }
		      System.out.println(name + "님의 입금 금액 : " + money + "원, 통잔 잔고 : " + bankBook.getBalance() + "원");
		   
	   }
   }
}


@Data
@AllArgsConstructor
class BankBook2{
   private String name;
   private int balance;
   
   
}