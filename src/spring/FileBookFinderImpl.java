package spring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileBookFinderImpl implements BookFinder {
	public List findAll() {
		String file = "D:\\eclipse-neon\\WorkSpace\\SpringBookLister\\src\\test.txt";
		List books = new ArrayList();

		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = in.readLine()) != null) {
				String[] sp = line.split(";");
				if (sp.length == 2) {
					Book book = new Book();
					book.setName(sp[0]);
					book.setAuthor(sp[1]);
					books.add(book);
				}else {
					System.out.println(sp.length);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return books;
	}
}
