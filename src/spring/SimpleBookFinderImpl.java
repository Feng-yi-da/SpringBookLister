package spring;

import java.util.ArrayList;
import java.util.List;

public class SimpleBookFinderImpl implements BookFinder {

	/**
	 * @see com.bjsxt.spring.BookFinder#findAll()
	 */
	public List findAll() {
		List books = new ArrayList();
		for (int i = 0; i < 20; i++) {
			Book book = new Book();
			book.setName("book" + i);
			book.setAuthor("author" + i);
			books.add(book);
		}
		return books;
	}

}
