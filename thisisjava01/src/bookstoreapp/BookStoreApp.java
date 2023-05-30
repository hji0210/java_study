package bookstoreapp;

import collectionFrameWorkpractice09.Book;

public class BookStoreApp {

	public static void main(String[] args) {
		
		Member member = new Member("clorwinter", "Voctoria", "A", 5000);
		Book[] bookArray = new Book[5];
		bookArray[0] =BookService.makeBook("comic", "열혈강호", "전극진,양재현",	"대원씨아이", 4500, "979-11-5754-926-9");
		bookArray[1] =BookService.makeBook("travel", "뉴욕 100배 즐기기", "홍지윤", "알에이치코리아", 14400, "978-89-255-8673-1");
		bookArray[2] =BookService.makeBook("travel", "바르셀로나,지금이 좋아", "정다운", "중앙북스", 	15000, "978-89-991-7580-0");
		bookArray[3] =BookService.makeBook("food", "오늘의 맥주", "이성준",	"오운	", 18000, "979-11-92814-04-9");
		bookArray[4] =BookService.makeBook("food", "버번 위스키의 모든 것", "조승원", "(주)교유당",	24000, "979-11-90277-42-6");
				
		Shirt[]	shirtArray = new shirt[3];	
		shirtArray[0] = ShirtService.makeService("코튼/린넨 버튼 다운 셔츠",	"blue", "Wow", "면 50%,마 50%	", "M", 60000);
		shirtArray[1] = ShirtService.makeService("코튼 셔츠",	"whit", "Wow", "면 100%", "L", 45000);				
		shirtArray[2] = ShirtService.makeService("코튼 버튼 다운 셔츠", 	"black", "Wow", "면 100%", "L", 53000);			
		
		Cart c = new Cart(member,bookArray, shirtArray);
		
		
               System.out.println("\n========= printBookExpense() ========");
               // 도서 구매 총액
               c.printBooksExpense();
		
		        System.out.println("\n========= printBooksInfo() ========");
		        //도서 구매 정보
		        c.printBooksInfo();
		        
		        System.out.println("\n========= printBooksInfoByCategory() ========");
		        //분아별 도서 구매 정보
                
                System.out.println("\n---- travel -----");
                	String category = "travel";
                	bs.printBookInfoByCategory(catetory);
                	
                	System.out.println("\n---- health -----");
	                category = "health";
	                bs.printBooksInfoByCategory(catetory);
	                
	                System.out.println("\n---- food -----");
	                category = "food";
	                bs.printBookStore(catetory);
	
	                System.out.println("\n---- health -----");
	                category = "health";
	                bs.printBookStore(catetory);
	                
	                System.out.println("\n===== printShirtsExpense() =======");
	                //셔츠 구매 총액
	                c.printShirtsExpense();
	                
	                System.out.println("\n===== printShirtsInfo()=====");
	                //셔츠 구매 정보
	                c.printShirtsInfo();
	                
	                System.out.println("\n===== printTotalExpense() =====");
	                //전체 구매(도서+셔츠) 정보
	                c.printTotalExpense();
	                
	                System.out.println("\n===== printCartInfo() =====");
	                //전체 구매(도서+셔츠) 정보
	                c.printCartInfo();
	                
	                System.out.println("n===== printGiftYn() ======");
	                //사은품 대상 여부, 200,000 이상 구매시 사은품 증정
	                c.printGiftYn();
	                
	                System.out.println("\n===== buy() ======");
	                //구매
	                //pointUseYn : 결제시 포인트 사용 여부, true(사용), false(미사용)
	                boolean pointUseYn = true;
	                c.buy(pointUseYn);
	}

}
