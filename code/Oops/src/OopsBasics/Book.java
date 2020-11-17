package OopsBasics;

public class Book {
	private String bookName;
	Author[] authors = new Author[2];
	private double price;
	private int qty = 0;
	
	Book(String bookName, Author[] authors, double price){
		this.bookName = bookName;
		this.authors = authors;
		this.price = price;
	}
	
	Book(String bookName, Author[] authors, double price, int qty){
		this.bookName = bookName;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorNames() {
		String authorNames = "";
		for(Author author:authors) {
			authorNames += author.getName() + ",";
		}
		return authorNames;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		String authorsString = "";
		for(Author authors: authors) {
			authorsString += " Book" + "[" + " Book Name = " + bookName + "," + " Authors{" + "Author" + "[" + " Name = " + authors.getName() + " Email = " + authors.getEmail() + " Gender = " + authors.getGender() +"}" + "]" + "," + " Price = " + price + " Quantity = " + qty + "]" + "\n";
		}
		return authorsString;
	}
	
	
}
