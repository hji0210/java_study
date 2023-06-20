package thisisjava01;

import reportcardapp.ReportCard;

public class ReportCardApp {
	
	public static void main(String[] args) {
		System.out.println("\n==== Object 1 ====");
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78; // Primitive Variable
		// Class   rv(Reference Variable)
		ReportCard rc1 = new ReportCard("Victoria", korean1, english1, math1);
		System.out.println(rc1.average());
		int sum1 = rc1.sum(); // rc1:sum() what are you doing? come on
		System.out.println("sum=" + sum1);
		int average1 = rc1.average();
		char hakjum1 = rc1.hakjum();
		System.out.println("hakjum=" + hakjum1);
		
//		rc1.printInfo();
	}

}
