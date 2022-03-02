package lms;

/**
 * Class that implements books
 * 
 * @author Andi
 * @author Vlad
 */
public class Book {
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	String bookID;
	String name;
	String publishDate;
	String publisher;
	String price;
	String pages;
	String edition;
	
	/**
	 * Book constructor
	 * 
	 * @param bookID
	 * @param name
	 * @param publishDate
	 * @param publisher
	 * @param price
	 * @param pages
	 * @param edition
	 */
	public Book(String bookID, String name, String publishDate, String publisher, String price, String pages, String edition) {
		super();
		this.bookID = bookID;
		this.name = name;
		this.publishDate = publishDate;
		this.publisher = publisher;
		this.price = price;
		this.pages = pages;
		this.edition = edition;
	}

	/**
	 * ToString function used to 
	 * print a book in the console
	 */
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", name=" + name + ", publishDate=" + publishDate + ", publisher=" + publisher
				+ ", price=" + price + ", pages=" + pages + ", edition=" + edition + "]";
	}
}
