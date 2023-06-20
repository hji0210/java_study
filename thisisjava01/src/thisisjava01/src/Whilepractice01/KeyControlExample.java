package Whilepractice01;

import java.util.Scanner;


public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed =0;
		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.증속 | 2.감속 | 3. 중지");
			System.out.println("-----------");
			System.out.println("선택: ");
			
			
			String strNum = scanner.nextLine();// Enter를 치기 전까지 쓴 문자열을 모두 리턴한다
			
			if(strNum.equals("1")) {//equals는 트루냐 펄스냐로 나뉨
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
				
			}
			
			
			
		}
		
		System.out.println("프로그램 종료");
	

	}

}
