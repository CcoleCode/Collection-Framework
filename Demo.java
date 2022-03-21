import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	static ArrayList<Book> books = new ArrayList<Book>();
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		//books.add(new Book(title, author, isbn, price, isBorrowed));
		
		System.out.println("Enter the following book details:");
		
		do {
		
		System.out.println("Enter Book Title (or 'done' to exit): ");
			
			String title = input.nextLine();
			//books.set(0, title);
			
			System.out.println("Author's name: ");
			
			String author = input.nextLine();
			//books.set(0, author);
			
			System.out.println("Book's isbn: ");
			
			long isbn = input.nextLong();
			//books.set(0, isbn);
			
			System.out.println("Book's rental price: ");
			
			//double price = input.nextDouble();
			////double price = books.set(0, input.nextDouble());
			
			System.out.println("Is the book borrowed? (true/false)");
			
			boolean isBorrowed = input.hasNext();
			//books.set(0, isBorrowed);
			
			books.add(new Book(title, author, isbn, price, isBorrowed));
			
		}
		while(input.nextLine() != "done") {
			
			}	
			//	System.out.println("----");
				
			//	System.out.println("The books your entered are: ");
			//	System.out.println(books);
		
		}
		
	}
	


