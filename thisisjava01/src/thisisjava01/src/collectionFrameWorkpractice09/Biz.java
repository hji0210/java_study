package collectionFrameWorkpractice09;

import java.util.List;
import java.util.ArrayList;

public class Biz {

	public List<Book> convert(String[] contents) {
		List<Book> booklist = new ArrayList<Book>();

		for (int i = 0; i < contents.length; i++) { // contents에서 하나씩꺼내
//			System.out.println(contents[i]);
			// comic/열혈강호/전극진-양재현/대원씨아이/4500/979-11-5754-926-9
			String[] data = contents[i].split("/"); // 꺼낸걸 짤라
			// data = {"comic",... "4500",...};
			String classification = data[0]; // 분류
			String title  = data[1];
			String author = data[2];
			String publisher = data[3];
			int price = Integer.parseInt(data[4]);
			String isbn = data[5];
			
			Book book = new Book(classification, title, author, publisher, price, isbn);
			booklist.add(book); // 짤라서 만든 book을 booklist에 넣어
		}
//		System.out.println(booklist);
		return booklist;					// Book 				Book	Book	Book
		// ArrayList booklist = [{classfication=comic, title=열혈강호...},{},{},{},{},{}....,{}]
		// List<Book> bookList = new ArrayList<>();
	}

}
