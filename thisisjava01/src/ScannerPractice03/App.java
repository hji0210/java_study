package ScannerPractice03;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		boolean member = true;
		   while(member) {
			   String menu = scanner.nextLine();
               
               switch (menu) {
                   case "1":
                       System.out.println("[전체 출력]");
                       manager.printPersonList();
                       break;
                   case "2":
                       System.out.println("[등록]");
                       manager.addPerson(scanner);
                       break;
                   case "3":
                       System.out.println("[수정]");
                       manager.updatePerson(scanner);
                       break;
                   case "4":
                       System.out.println("[삭제]");
                       manager.deletePerson(scanner);
                       break;
                   case "5":
                       System.out.println("[조회] 성별");
                       manager.selectPersonBySex(scanner);
                       break;
                   case "6":
                       System.out.println("[조회] 나이 구간");
                       manager.selectPersonBetweenAge(scanner);
                       break;
                   case "9":
                       System.out.println("[종료]");
                       System.out.println("프로그램을 종료합니다.");
                       member = false;
                       break;
                   default:
                       System.out.println("올바른 메뉴를 선택해주세요.");
                       break;
               }
           } catch (Exception e) {
               // 예외 처리
           }
       }
       
       scanner.close();
       System.out.println("Scanner Closed");
   }
}