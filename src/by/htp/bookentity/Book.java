package by.htp.bookentity;

public class Book {

	private int year;
	private String title;
	private String author;

	public Book(int year, String title, String author) {
		super();
		this.year = year;
		this.title = title;
		this.author = author;
	}

	public void printBook() {
		System.out.println(getAuthor() + " " + getTitle() + " " + getYear());
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
