package bookstoreapp;

import collectionFrameWorkpractice09.Book;

public class BookStore {
	
	 private Book[] bookArray;
	

     public BookStore(Book[] bookArray){
        this.bookArray=bookArray;
     }


	public Book[] getBookArray() {
		return bookArray;
	}


	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}

    public void printBookStore() {
    	for(int i=0; i < bookArray.length; i++) {
    		System.out.println();
    		System.out.println((i+1) + ".");		
    	    System.out.println("분야 = " + bookArray[i].getClassification());
    	    System.out.println("제목 = " + bookArray[i].getTitle());
    	    System.out.println("저자 = " + bookArray[i].getAuthor());
    	    System.out.println("출판사 = "+ bookArray[i].getPublisher());
    	    System.out.println("가격 = " + bookArray[i].getPrice());
    	    System.out.println("isbn = " + bookArray[i].getIsbn());
    	    System.out.println();
    	}
    }
    
	private void changeClassification(String classification) {
		if(classification.equals("comic")) {
			System.out.println("만화");//==을 하면 기본 타입의 값, 참조 타입 값을 비교하려면 변수.equals()
		}
	  else {
           System.out.println("여행");
	  }
      else {
	       System.out.println("음식");
  
   }

 	}
     
     
     
