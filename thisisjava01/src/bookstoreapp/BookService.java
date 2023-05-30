package bookstoreapp;//스태틱 메소드 만들기

import collectionFrameWorkpractice09.Book;

public class BookService {
    
	public static Book makeBook(String classification,String title,String author,String publisher,int price,String isbn) {
		return new Book(classification,title,author,publisher,price,isbn);
	}
	

}
