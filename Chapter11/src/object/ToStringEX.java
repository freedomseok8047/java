package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEX {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		Book book2 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.equals(book2));
		
		String str = new String ("test");
		Integer i1 = new Integer(100);
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(i1);
		System.out.println(i1.toString());
		
		
	}
}
