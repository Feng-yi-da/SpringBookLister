package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookLister bl = (BookLister) beanFactory.getBean("bookLister");
		Book[] books = bl.findBooks("天龙八部");
		if (books != null) {
			for (int i = 0; i < books.length; i++) {
				System.out.println("书《" + books[i].getName() + "》的作者是：" + books[i].getAuthor());
			}
		}
	}

}
