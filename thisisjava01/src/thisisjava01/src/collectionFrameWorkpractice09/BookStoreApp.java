package collectionFrameWorkpractice09;

import java.util.List;

public class BookStoreApp {

	public static void main(String[] args) {

		String[] contents = { "comic/열혈강호/전극진-양재현/대원씨아이/4500/979-11-5754-926-9",
				"travel/뉴욕 100배 즐기기/홍지윤/알에이치코리아/14400/978-89-255-8673-1",
				"travel/바르셀로나 지금이 좋아/정다운/중앙북스/15000/978-89-991-7580-0", 
				"food/오늘의 맥주/이성준/오운/18000/979-11-92814-04-9",
				"food/버번 위스키의 모든 것/조승원/(주)교유당/24000/979-11-90277-42-6" };

		Biz biz = new Biz();
		List<Book> bookList = biz.convert(contents);
		
		BookStore bs = new BookStore(bookList);
		
		
//		for (Book book : bookList) { // bookList에 있는걸 하나씩 꺼내!
//			System.out.println(book.toString());
//		}
//		 Collection Framework
//	    interface level : Map, Set, List
		// implementation    ^      ^    ^
	 	// Class level : ArrayList, HashMap, HashSet, ... LinkedList
		// RecordMap ... x
		// 1 1 1 2 2 2 3 3 3 3 3 3 4 4 값의중복을 제거 == Set
		// 1 2 3 4
//		Member member = new Member("clorwinter", "Voctoria", "A", 5000);
//		Book[] bookArray = new Book[5];
//		bookArray[0] =BookService.makeBook("comic", "열혈강호", "전극진,양재현",	"대원씨아이", 4500, "979-11-5754-926-9");
//		bookArray[1] =BookService.makeBook("travel", "뉴욕 100배 즐기기", "홍지윤", "알에이치코리아", 14400, "978-89-255-8673-1");
//		bookArray[2] =BookService.makeBook("travel", "바르셀로나,지금이 좋아", "정다운", "중앙북스", 	15000, "978-89-991-7580-0");
//		bookArray[3] =BookService.makeBook("food", "오늘의 맥주", "이성준",	"오운	", 18000, "979-11-92814-04-9");
//		bookArray[4] =BookService.makeBook("food", "버번 위스키의 모든 것", "조승원", "(주)교유당",	24000, "979-11-90277-42-6");
//				
//		Shirt[]	shirtArray = new Shirt[3];	
//		shirtArray[0] = ShirtService.makeService("코튼/린넨 버튼 다운 셔츠",	"blue", "Wow", "면 50%,마 50%	", "M", 60000);
//		shirtArray[1] = ShirtService.makeService("코튼 셔츠",	"whit", "Wow", "면 100%", "L", 45000);				
//		shirtArray[2] = ShirtService.makeService("코튼 버튼 다운 셔츠", 	"black", "Wow", "면 100%", "L", 53000);			
		
       System.out.println("\n========= printBookStore() ========");
       bs.printBookStore();
        
        System.out.println("\n========= printBooksByCategory() ========");
        String category = "travel";
         bs.printBooksByCategory(category);
        
        
        System.out.println("\n========= printBooksByIsbn() ========");
        String isbn = "979-11-90277-42-6";
        bs.printBooksByIsbn(isbn);
        
        
        System.out.println("\n========= printBooksByMaxPrice() ========");
        int maxPrice = 10000;
        bs.printBooksByMaxPrice(maxPrice);
        
        
        System.out.println("\n========= printBooksByMinPrice() ========");
        int minPrice = 15000;
        bs.printBooksByMinPrice(minPrice);
        
        System.out.println("\n========= printBooksByBetweenPrice() ========");
        int betweenMinPrice = 5000;
        int betweenMaxPrice = 20000;
        bs.printBooksByBetweenPrice(betweenMinPrice,betweenMaxPrice);
	}
}