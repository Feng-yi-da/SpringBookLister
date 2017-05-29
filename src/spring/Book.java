package spring;

public class Book {
	private String name;
	private String author;

	/**
	 * 
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * @return Returns the author.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            The author to set.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
