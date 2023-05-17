package thisisjava01;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
		int val1 = 10;
		int val2 = 6;
		
		cal.plus(val1,val2);//더하기
		cal.minus(val1,val2);//곱하기
		cal.multiply(val1,val2);
		cal.divide(val1,val2);
		cal.rest(val1,val2);
//		
	}

}
