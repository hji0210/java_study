
public class DataDotutilApp {

	public static void main(String[] args) {
	
		
		String date="20230501";
		
		
		System.out.println("========YYYY.MM.DD");
		String dotDate = DataDotUtil.dashDate(date);
		System.out.println(dotDate);
		
		System.out.println("\n========YYYY-MM-DD");
		String dashDate = DataDotUtil.dashDate(date);
		System.out.println(dashDate);
		
		
		
	}

}
