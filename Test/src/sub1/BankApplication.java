package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜: 2024/01/19
 * 이름: 정원구
 * 내용: 수행평가
 */
public class BankApplication {
	
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			// 목록의 숫자 입력시 출력 될 내용 지정
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				createAccount();
				
			}else if (num == 2) {
				accountList();
				
			}else if (num == 3) {
				deposit();
				
			}else if (num ==4) {
				withdraw();
				
			}else if(num == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int money = scanner.nextInt();
		Account account = new Account(ano, owner, money);
	    accounts.add(account);

	    System.out.println("결과: 계좌가 생성되었습니다.");

				
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");

		if(accounts.isEmpty()) {
			System.out.println("생성된 계좌가 없습니다");
		}
		for(Account account : accounts ) {
			System.out.println(account);
		}
	}	
			

	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("예금액:");
		int dep = scanner.nextInt();
		
		//등록되지 않은 계좌번호 입력시 출력 될 문구 지정
		if(findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		//등록된 계좌번호 입력시 출력 될 문구 지정	
		}else {
			findAccount(ano).setBalance(findAccount(ano).getBalance()+dep);
		System.out.println("결과: 입금이 성공 되었습니다.");
		}
		
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("출금액:");
		int with = scanner.nextInt();
		
		//등록되지 않은 계좌번호 입력시 출력 될 문구 지정
		if(findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다");
			
		}else {
			//잔액보다 큰 액수 입력시 출력될 예외 문구 지정
			if(with > findAccount(ano).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			}else {
				//등록된 계좌번호 입력, 잔액보다 적은 액수 입력시 출력 될 문구 지정	
				findAccount(ano).setBalance(findAccount(ano).getBalance() - with);
				System.out.println("결과: 출금이 성공 되었습니다.");
			}
		}
		
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		 for (Account account : accounts) {
			 //문자열 비교이므로 equals() 메소드 사용
		        if (account.getAno().equals(ano)) {
		        //문자열이 같다면 해당 계좌 리턴
		        	return account;
		        }
		    }
		    //같은 문자열이 없으면 null로 리턴
		    return null;
		}
}