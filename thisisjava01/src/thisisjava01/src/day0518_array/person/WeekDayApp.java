package day0518_array.person;

public class WeekDayApp {

	public static void main(String[] args) {
	
		String[] weekDay;
		
		weekDay = new String[7];
		
		weekDay[0]=new String("월요일");
		weekDay[1]=new String("화요일");
		weekDay[2]=new String("수요일");
		weekDay[3]=new String("목요일");
		weekDay[4]=new String("금요일");
		weekDay[5]=new String("토요일");
		weekDay[6]=new String("일요일");
		
//		System.out.println("=====Week Day=====");
//		System.out.println("weekDay[0] " + weekDay[0]);
//		System.out.println("weekDay[1] " + weekDay[1]);
//		System.out.println("weekDay[2] " + weekDay[2]);
//		System.out.println("weekDay[3] " + weekDay[3]);
//		System.out.println("weekDay[4] " + weekDay[4]);
//		System.out.println("weekDay[5] " + weekDay[5]);
//		System.out.println("weekDay[6] " + weekDay[6]);
//		
		for(int i=0; i<7; i++ ) {
			System.out.println("weekDay[" + i +  "] " + weekDay[i]);//반복문 사용
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
