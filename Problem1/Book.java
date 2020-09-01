package Oops_Exercise_2.Problem1;

public class Book {
	private long isbn;
	private String title;
	private String edition;
	private Author author;
	public Book(long isbn, String title, String edition, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.edition = edition;
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book() {
		
	}
	public String toString() {
		return "Book{isbn="+getIsbn()+", title="+getTitle()+", edition="+getEdition()+", author="+getAuthor()+"}";
	}
	public String getBookDetails() {
		return toString();
	}
}
