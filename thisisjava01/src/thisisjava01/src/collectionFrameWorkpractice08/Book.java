package collectionFrameWorkpractice08;

public class Book {
	
	private String classification;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String isbn; 
	
	public Book(String classification, String title, String  author, String publisher, int price, String isbn) {
		this.classification=classification;
		this.title=title;
		this.author= author;
		this.publisher=publisher;
		this.price=price;
		this.isbn=isbn;
	}
	
    public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
