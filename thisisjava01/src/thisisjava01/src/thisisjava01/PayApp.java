package thisisjava01;

public class PayApp {

	public static void main(String[] args) {
	
		int hourPay = 9620; //사급
		
		//8시간 근무 ㅗ
		
		Pay p = new Pay(hourPay);
		
		System.out.println("\n======하루 급여 ========");
		//하루 8시간 근무
		int dayPay = p.getDayPay();
		System.out.println("급여=" + dayPay);
		
		// year pay
		int weekPay = p.getWeekPay();
         System.out.println("급여=" + weekPay);
		         
		// year pay
		int yearPay = p.getYearPay();
         System.out.println("급여=" + yearPay);
         
	}

}
