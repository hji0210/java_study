package OutputStream09;

import java.util.Scanner;

public class Scannerpractice01 {

	public static void main(String[] args) {
		System.out.println("====Start =====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 =>");
		String i1 = sc.nextLine();
		
		
		System.out.print("두번째 숫자 입력 =>");
		String i2 = sc.nextLine();
		
		
		int plusResult = Integer.parseInt(i2) + Integer.parseInt(i2);
		System.out.print(i1 + "+" + i2 + "=");
		System.out.println(plusResult);
		
		sc.close();
		System.out.println("====== End ======");

	}

}
