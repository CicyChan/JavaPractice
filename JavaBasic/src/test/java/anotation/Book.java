package test.java.anotation;

public class Book {
	public String bookName;

	@Author(author = "Cai")
	public String author;

	public Book() {
		super();
	}

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
