package spring;

import java.util.Iterator;
import java.util.List;

public class BookListerImpl implements BookLister {

	BookFinder finder;

	public BookListerImpl() {
		// finder = new SimpleBookFinderImpl();
		finder = new FileBookFinderImpl();
	}

	public Book[] findBooks(String name) {
		List books = finder.findAll();
		for (Iterator iter = books.iterator(); iter.hasNext();) {
			Book book = (Book) iter.next();
			if (!book.getName().equals(name)) {
				iter.remove();
			}
		}
		return (Book[]) books.toArray(new Book[books.size()]);
	}
	
	public void setFinder(BookFinder finder) {
		this.finder = finder;
	}

}
