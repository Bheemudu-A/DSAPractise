import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingRoom {
	
	static List<String> books = new ArrayList<>();
	static List<String> authors = new ArrayList<>();
	static List<Integer> numOfCpoies = new ArrayList<>();
	static List<String> hasEbook = new ArrayList<>();
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        books.add("Absolute Java");
        authors.add("Savitch");
        numOfCpoies.add(5);
        hasEbook.add("yes");
        
        books.add("JAVA: How to Program");
        authors.add("Deitel and Deitel");
        numOfCpoies.add(0);
        hasEbook.add("yes");
        
        books.add("Computing Concepts with JAVA 8 Essentials");
        authors.add("Horstman");
        numOfCpoies.add(5);
        hasEbook.add("no");
        
        books.add("Java Software Solutions");
        authors.add("Lewis and Loftus");
        numOfCpoies.add(5);
        hasEbook.add("no");
        
        books.add("Java Program Design");
        authors.add("Cohoon and Davidson");
        numOfCpoies.add(1);
        hasEbook.add("yes");

        
            System.out.println("Choose an option:");
            System.out.println("1. Add a book to shopping cart");
            System.out.println("2. View shopping cart");
            System.out.println("3. Remove a book from shopping cart");
            System.out.println("4. Checkout");
            System.out.println("5. List all books");
            System.out.println("6. Quit");
            System.out.print("Please select: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    searchBooks(scanner);
                    break;
                case 5:
                    listAllBooks(scanner);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
	}

	private static void listAllBooks(Scanner sc) {
		System.out.println("The following books are available");
		
		int i=1;
		for(String book : books) {
			System.out.println(i+". "+ books.get(i-1));
			i++;
		}
		
	}

	private static void searchBooks(Scanner scanner) {
		System.out.println();
		System.out.print("Enter a keyword:");
		String input = scanner.nextLine().toLowerCase().replace(" ", "");
		
		int j=1;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).toLowerCase().replace(" ", "").contains(input)) {
				System.out.println(j +". "+books.get(i));	
				j++;
			}
		}
		
		if(j>1) {
			System.out.println(j+". "+"Cancel");
		}else {
			System.out.println("Sorry! There are no books that match with your key word.");
		}
		
	}

}
