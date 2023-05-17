package thisisjava01;

public class Pay {
	private int dayPay;
	private int weekPay;
	 private int yearPay;
	 private int hourPay;
	 
	public Pay(int hourPay) {
		this.hourPay = hourPay;
	}
	public int getDayPay() {
		return hourPay*8;
	}
	
	public int getYearPay() {
		
		return hourPay*8*5*52 ;//히잉
	}
	
	public int getWeekPay( ) {
		
		return hourPay*8*5;
		
	}
	
	
	
	
	
	

}
