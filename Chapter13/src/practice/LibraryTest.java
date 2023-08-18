package practice;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		System.out.println("모든 책의 가격의 합 : "+bookList.stream()
		.mapToInt(c->c.getPrice())
		.sum());
		
		bookList.stream().filter(f->f.getPrice()>=20000)
		.map(c->c.getName())
		.sorted()
		.forEach(s->System.out.print(s + ","));
	}

}
