package lms;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookIntegrity_TEST {
	
	Book book = new Book(	"1", 			// Book ID
							"Book1", 		// Book Name
							"10.10.2002",	// Publish Date
							"Publisher1", 	// Publisher
							"100",			// Price
							"379", 			// Pages
							"Hardcover"		// Edition
		);

	public boolean resultToBool(Book b) {
		if (AddBook.checkBookDataIntegrity(b) == 1) {
			/*
			 * checkBookDataIntegrity FAILED!
			 */
			return false;	
		} else {
			/*
			 * checkBookDataIntegrity PASSED!
			 */
			return true;
		}
	}
	
	@Test
	public void test1() {
		book.setBookID("");
		
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	}
	
	@Test
	public void test2() {
		book.setName("");
		
		boolean checkBook_Result = resultToBool(book);
		assertFalse(checkBook_Result);

	}
	
	@Test
	public void test3() {
		book.setPublishDate("");
		
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	}
	
	@Test
	public void test4() {
		book.setPublisher("");
		
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	}
	
	@Test
	public void test5() {
		book.setEdition("");
		
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	}
	
	@Test
	public void test6() {
		book.setPrice("");
		
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	}
	
	@Test
	public void test7() {
		book.setPages("");
		
		boolean checkBook_Result = resultToBool(book); 
		
		assertFalse(checkBook_Result);
	}
	
	
	@Test
	public void test8() {	
		boolean checkBook_Result = resultToBool(book);
		
		assertFalse(checkBook_Result);
	} 
}
