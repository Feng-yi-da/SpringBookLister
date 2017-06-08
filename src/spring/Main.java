package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookLister bl = (BookLister) beanFactory.getBean("bookLister");
		Book[] books = bl.findBooks("�����˲�");
		if (books != null) {
			for (int i = 0; i < books.length; i++) {
				System.out.println("�顶" + books[i].getName() + "���������ǣ�" + books[i].getAuthor());
			}
		}
		Book[] books2 = bl.findBooks("�����ӻ���");
		if (books2 != null) {
			for (int i = 0; i < books2.length; i++) {
				System.out.println("�顶" + books2[i].getName() + "���������ǣ�" + books2[i].getAuthor());
			}
		}
		
	}

}
