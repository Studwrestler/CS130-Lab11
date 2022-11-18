package lab11;

class Publisher {
	String name;
	String city;
	String PublisherID;
	Author Author;
	Book Book;
	Publisher(String name,String city, String PublisherID, Author Author, Book Book){
		this.name=name;
		this.city=city;
		this.PublisherID=PublisherID;
		this.Author=Author;
		this.Book=Book;
	}

	
	public static void main(String[] args) {
		Author a = new Author("Ben Dover","312 Newgrass", 70);
		Book b = new Book(12,"Hunger Days");
		Publisher p = new Publisher("Scholastic", "Atlanta", "Schl123", a,b);
		
		System.out.println("--Publisher Details--");
		System.out.println("Name: "+p.name);
		System.out.println("City: "+p.city);
		System.out.println("PublisherID: "+p.PublisherID);
		System.out.println("----Book Details----");
		System.out.println("Book Name: "+p.Book.name);
		System.out.println("Book ID: "+p.Book.price);
		System.out.println("---Author Details---");
		System.out.println("Author Name: "+p.Author.Name);
		System.out.println("Author Address: "+p.Author.Address);
		System.out.println("Author Age: "+p.Author.Age);

	}


}
