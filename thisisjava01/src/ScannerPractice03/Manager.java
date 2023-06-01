package ScannerPractice03;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Manager { // 1depth
   List<Member> list = new ArrayList<>(); 
   //회원 전체를 가지고 있는 리스트 
   // 필드==전역변수 >> 처음
   

   public void printPersonList() {//객체 하나하나 뽑아낼 때 반복문 // 2depth
      for(int i=0; i<list.size(); i++) { // 3depth
    	  System.out.print((i+1) + ".");
         Member a = list.get(i);//하나하나 가져오기
         System.out.print(a.getId()+ "\t" + a.getName() + "\t" + a.getAge() + "\t");
         String sex = a.getSex();//여, 남이 나와야해서
         System.out.println((sex.equals("F")) ? "여" : "남"); 
         
      }
   }

   public void addPerson(Scanner sc) { // 2depth
      
      System.out.println("ID를 입력하세요= >");
      String id = sc.nextLine();
      System.out.println("이름을 입력하세요= >");
      String name = sc.nextLine();
      System.out.println("나이를 입력하세요= >");
      int age = Integer.parseInt(sc.nextLine());
      System.out.println("성별을 입력하세요(값 : F, M) = >");
      String sex = sc.nextLine().toUpperCase();
      
     for(int i=0; i<list.size(); i++) {
    	if(list.get(i).getId().getSex)
    		System.out.println("인원을 추가할 수 없습니다. 동일한 Id가 존재합니다.");
     } else
     System.out.println(list.add(new Member(id, name, age, sex));
//    
    
    
      
      
   }

   public void selectPersonBySex(Scanner sc) {
	   
	   System.out.print("성별을 입력하세요(값 : F, M) = >");
	   String sex = sc.nextLine();
	   for(int i=0; i<list.size(); i++ ) {
		   if(list.get(i).getSex().equals(sex)) {
			   Member a = list.get(i);
		       System.out.println(a.getId()+ "\t" + a.getName() + "\t" + a.getAge() + "\t" + a.getSex());   
	   }   	   
		   
   }
   }    
 
    
   public void updatePerson(Scanner sc) {
      System.out.println("ID를 입력하세요= >");
      String id = sc.nextLine();
      System.out.println("수정 이름을 입력하세요= >");
      String name = sc.nextLine();
      System.out.println("수정 나이를 입력하세요= >");
      int age = Integer.parseInt(sc.nextLine());
      System.out.println("수정 성별을 입력하세요 (값 : F, M)= >");
      String sex = sc.nextLine();
      
      for(int i=0; i<list.size(); i++) {
         // if 하나씩 꺼내다가 아이디가 일치하면
         //  if문 안에서 다 setter로 덮어씌우기함
         if(id.equals(list.get(i).getId())) {
            list.get(i).setName(name);
            list.get(i).setAge(age);
            list.get(i).setSex(sex);
            break;
         }
         
      }
   }
   
   public void deletePerson(Scanner sc) {
      System.out.println("ID를 입력하세요= >");
      String id = sc.nextLine();
      for(int i=0;i<list.size();i++) {
         if(id.equals(list.get(i).getId())) {
            list.remove(i);
            break;
         }
      }      
      
//      
//     for(Member member : list) {
//         if(id.equals(member.getId())) {
//           list.remove(member);
     
      }



public void selectPersonBetweenAge(Scanner sc) {

	 System.out.println("시작 나이를 입력하세요= >");
	 int minAge = Integer.parseInt(sc.nextLine());
	 System.out.println("종료 나이를 입력하세요= >");
	 int maxAge = Integer.parseInt(sc.nextLine());
	  for(int i=0;i<list.size();i++) {
	   if(list.get(i).getAge() >= minAge && maxAge <= list.get(i).getAge()) {
		   Member a = list.get(i);
	       System.out.print(a.getId()+ "\t" + a.getName() + "\t" + a.getAge() + "\t"); 
	       String sex = a.getSex();
	       System.out.println((sex.equals("F")) ? "여" : "남"); 
	   }
		   //원래 2<x<3인데 2,3두개 다 인식을 못해서 &&로 이어져야함
	    	
	}
	
	
}

   }

