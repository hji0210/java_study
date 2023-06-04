package ScannerPractice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ScannerPractice03.Member;



public class Manager {

	
	List<Member> list = new ArrayList<>();//list가 있는데 list안에 항목들이 다 멤버객체
	
	
	public void printPersonList() {
		for(int i=0; i <list.size(); i++) {
			System.out.println(list.get(i).toString());//리스트에 있는 항목 다 출력
		}
		
	}

	public void addPerson(Scanner sc) {
		Member member = new Member();	// 1. 값이 비어있음	
		System.out.println("ID를 입력하세요 = >");
		String id = sc.nextLine(); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		member.setId(id); // id를 member 객체에 셋팅(셋터)
		System.out.println("이름을 입력하세요 =>");
		String name = sc.nextLine();
		member.setName(name);
		System.out.println("나이를 입력하세요 =>");
		int age = Integer.parseInt(sc.nextLine());
		member.setAge(age);
		System.out.println("성별을 입력하세요(값 : F, M =>");
		String sex = sc.nextLine();
		member.setSex(sex);
		//list.add 전에 유효성 체크해야함 (아이디 중복)
		Boolean duplicated = false; // 아이디 중복체쿠, 새로만든거랑 기존에 있는거랑 비교
		for(int i=0;i<list.size();i++) {//for 하나씩 꺼낸다, if는 비교or검사
			if(list.get(i).getId().equals(id)) {
				System.out.println("인원을 추가할 수 없습니다. 아이디가 중복됩니다.");
				duplicated = true;
				break;
			}
		}
		if(!duplicated) list.add(member); // 다 셋팅된 member를 list에 넣어줌
	}
	
	public void updatePerson(Scanner sc) {
		System.out.println("ID를 입력하세요 = >");
		String id = sc.nextLine(); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		System.out.println("수정 이름을 입력하세요 = >");
		String name = sc.nextLine(); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		System.out.println("수정 나이를 입력하세요 = >");
		int age = Integer.parseInt(sc.nextLine()); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		System.out.println("수정 성별 입력하세요 = >");
		String sex = sc.nextLine(); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		for(int i=0;i<list.size();i++) {//for 하나씩 꺼낸다, if는 비교or검사
			if(list.get(i).getId().equals(id)) {
				list.get(i).setName(name);
				list.get(i).setAge(age);
				list.get(i).setSex(sex);
		    }
	    }
	}
	
	public void deletePerson(Scanner sc) {
		System.out.println("ID를 입력하세요 = >");
		String id = sc.nextLine(); // 2. 스캐너로 입력한 아이디를 id에 넣어줌
		for(int i=0;i<list.size();i++) {//for 하나씩 꺼낸다, if는 비교or검사
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
		    }
	    }
	}
	
	
	
	public void selectPersonBySex(Scanner sc) {
	 System.out.println("성별을 입력하세요(값 : F, M) = >");
	 String sex = sc.nextLine();
	  for(int i=0;i<list.size();i++) {
		  if(list.get(i).getSex().equals(sex)) {
	          System.out.println("아이디 = " + list.get(i).getId() + "이름 =" +  list.get(i).getName() + "나이=" +  list.get(i).getAge() + "성별 =" +  list.get(i).getSex());
//	          if(list.get(i).getSex().equals(sex)) {
//				   Member a = list.get(i);
//			       System.out.println(a.getId()+ "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getSex());  이걸로 쓰는게 보기 편함 
		   }   	   
			
		  }
	  }
	
	
	
	public void selectPersonBetweenAge(Scanner sc) {
		int startAge, endAge;
		while(true) { // 입력을 다받고, 특정조건으로 검사해서 통과 못하면 다시 처음부터
			System.out.println("시작 나이를 입력하세요 = >");
			startAge = Integer.parseInt(sc.nextLine());
			System.out.println("종료 나이를 입력하세요 => ");
			endAge = Integer.parseInt(sc.nextLine());
			if(startAge > endAge) {
				System.out.println("시작 나이가 종료나이보다 큽니다. 다시 입력해주세요");
			}else {
				break;
			}
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge() >= startAge  && list.get(i).getAge()<=endAge) {
				  System.out.println("아이디 = " + list.get(i).getId() + "이름 =" +  list.get(i).getName() + "나이=" +  list.get(i).getAge() + "성별 =" +  list.get(i).getSex());
	        }
	    }
		
	}

}
