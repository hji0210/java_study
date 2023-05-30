package collectionFrameWorkpractice09;

import java.util.List;

import collectionFrameWorkpractice09.Book;

public class BookStore {
	
   private List<Book> bookList;

	public BookStore(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void printBookStore() {
		for(int i=0; i< bookList.size(); i++) {
			System.out.println((i+1) + ".");
			System.out.println("분야=" + bookList.get(i).getClassification());//객체를 리스트에 넣음
			System.out.println("제목=" + bookList.get(i).getTitle());
			System.out.println("저자=" + bookList.get(i).getAuthor());
			System.out.println("출판사=" + bookList.get(i).getPublisher());
			System.out.println("가격=" + bookList.get(i).getPrice());
			System.out.println("isbn="+ bookList.get(i).getIsbn());
			
		}
	}
	public void printBooksByCategory(String category) {
		for(int i=0; i< bookList.size(); i++) {
			if (bookList.get(i).getClassification().equals(category)) {//참조타입의 
				System.out.println("분야=" + bookList.get(i).getClassification());//객체를 리스트에 넣음
				System.out.println("제목=" + bookList.get(i).getTitle());
				System.out.println("저자=" + bookList.get(i).getAuthor());
				System.out.println("출판사=" + bookList.get(i).getPublisher());
				System.out.println("가격=" + bookList.get(i).getPrice());
				System.out.println("isbn="+ bookList.get(i).getIsbn());
				
			}
			
		}
	}
	
	
}

 



