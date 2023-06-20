package LambdaPractice08;

public class AppLambda {

	public static void main(String[] args) {

		
		System.out.println("\n======= Lambda ======");
		
		System.out.println("\n----- 1. ------");


//		Drawable d1 = new Drawable() {
//			@Override
//			public String draw(String color, String lineType) {
//				return color + " " + lineType + " " + "삼각형";
//			}
//		};
//		
//		System.out.println(d1.draw("검은색", "점선"));
		
		Drawable d2 = (String color, String lineType) -> {
			return color + " " + lineType + " " + "삼각형";
		};

		System.out.println(d2.draw("검은색", "점선"));
		
		
		System.out.println("\n----- 2. ------");
		Drawable d3 = (String color, String lineType) -> {
			return color + " " + lineType + " " + "원";
		};
		
		
		
		
		System.out.println(d3.draw("파란색", "실선"));
	}

}
