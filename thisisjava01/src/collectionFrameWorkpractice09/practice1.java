package collectionFrameWorkpractice09;

public class practice1 {
	public static void main(String[] args) {
		int a = 1; // 기본타입이 변수의 타입이엇다면
		//a는 int / 1은 int
		// 정수는 쉬워
		// 복잡한자료를 다루기위해 클래스, 리스트가 나오는거
		
		//복잡한자료들을 다뤄야대
		//도서관 
		//Book(제목,출판사,저자,가격...) 1개
		// .. 2개
		//claass는 만들엇어..근데이거를 또 1개로만들고싶어
		
		// Book1(제목,출판사,저자,가격) Book2(제목,출판사,저자,가격) Book3(제목,출판사,저자,가격)
		// ArrayList
		
		Book book = new Book(); // 클래스가 변수의 타입이되고
		
		List<String> list = new ArrayList<>();
		List<Book> bookList = new ArrayList<>();
		
		int[] array = new int[5];
		
	}

}
