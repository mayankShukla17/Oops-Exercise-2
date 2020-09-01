package Oops_Exercise_2.Problem1;

public class BookService {
	public Author createAuthor(String name, String country) {
		Author author=new Author(name,country);
		return author;
	}
	public Book createBook(long isbn, String title, String edition, String name, String country) {
		Author author=createAuthor(name, country);
		Book book=new Book(isbn,title,edition,author);
		return book;
	}
	public static void main(String[] args) {
		BookService bookService = new BookService();
        String name = "Dr APJ Abdul Kalam";
        String country = "India";
        long isbn=9788173711466L;
        String title="The Wings of Fire";
        String edition="1999";

        Author author=bookService.createAuthor(name,country);
        Book book=bookService.createBook(isbn,title,edition,name,country);
        System.out.println(author.getAuthorDetails());
        System.out.println(book.getBookDetails());
	}
}
