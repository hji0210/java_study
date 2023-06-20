package LambdaPractice09;

public class App {

	public static void main(String[] args) {

		System.out.println("\n======= Java =======");
		Addable a1 = new Addable() {
			@Override
			public int add(int i, int j) {
				int add = i + j;
				return add;
			}
		};
		int add1 = a1.add(1, 2);
		System.out.println("i + j=" + add1);

		System.out.println("\n==== Lambda ======");

		System.out.println("\n----- Type1. ----------");
		Addable a2 = (int i, int j) -> {
			int add = i + j;
			return add;

		};

		int add2 = a2.add(1, 2);
		System.out.println("i + j=" + add2);

		System.out.println("\n---- Tyype2. -----");
		// 실행문 내 리턴문만 존재할 경우, 중괄호 및 return 생략 가능

		Addable a3= (int i, int j) ->  i + j;
		System.out.println("i + j=" + a3.add(1, 2));

	}
}
