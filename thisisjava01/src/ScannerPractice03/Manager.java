package ScannerPractice03;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Manager {

 
	List<Member> list = new ArrayList<>();

	public void printPersonList() {//객체 하나하나 뽑아낼 때 반복문
	
		for(int i=0; i<list.size(); i++) {
			Member a = list.get(i);
			System.out.println(a.getId()+ "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getSex());
		}
		
	}

	public void addPerson(Scanner sc) {
		
		System.out.println("ID를 입력하세요= >");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요= >");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요= >");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("성별을 입력하세요(값 : F, M) = >");
		String sex = sc.nextLine();
		
		list.add(new Member(id, name, age, sex));
		
		
	}




	public void selectPersonBySex(Scanner sc) {

		
	}











	public void updatePerson(Scanner sc) {
		// TODO Auto-generated method stub
		
	}




}



