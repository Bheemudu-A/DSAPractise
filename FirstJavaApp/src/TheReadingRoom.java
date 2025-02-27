import java.util.ArrayList;
import java.util.Scanner;

public class TheReadingRoom { 
    
 // List to store all books available in the Reading Room
    private ArrayList<Book> books;
    
    // List to store the books added to the user's cart
    private ArrayList<Book> cart;

    /**
     * Constructor initializes the Reading Room by populating the book list and initializing the cart.
     */
    public TheReadingRoom() {
        books = new ArrayList<>(); // Initialize the list to store books
        cart = new ArrayList<>();  // Initialize the cart to store user's selected books
        populatingBooks();           // Populate the books list with some default books
    }
    
    
    /*
     * Main method to execute the application.
     */
    /**
     * The main method creates a ReadingRoom instance and starts the program.
     */
    public static void main(String[] args) {
        TheReadingRoom readingRoom = new TheReadingRoom();
        readingRoom.start();
    }
    
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int option; // Variable to store the user's selected option
        System.out.println("===============================================\nWelcome to The Reading Room!\n===============================================");
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add a book to shopping cart");
            System.out.println("2. View shopping cart");
            System.out.println("3. Remove a book from shopping cart");
            System.out.println("4. Checkout");
            System.out.println("5. List all books");
            System.out.println("6. Quit");
            System.out.print("Please select: ");
            option = scanner.nextInt();// Read the user's input as an integer
            scanner.nextLine(); //Clear's the newline character left in the buffer

            switch (option) {
                case 1:
                    addBookToCart(scanner);
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    removeBookFromCart(scanner);
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    listAllBooks();
                    break;
                case 6:
                	System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 6);
    }

    /*
     * Populating the books ArrayList with a predefined set of Book objects.
     * This method initializes the ArrayList with sample books, including their title,
     * author, number of physical copies available, and ebook availability.
     */
    private void populatingBooks() {
        books.add(new Book("Absolute Java", "Savitch", 5, true));
        books.add(new Book("JAVA: How to Program", "Deitel and Deitel", 0, true));
        books.add(new Book("Computing Concepts with JAVA 8 Essentials", "Horstman", 5, false));
        books.add(new Book("Java Software Solutions", "Lewis and Loftus", 5, false));
        books.add(new Book("Java Program Design", "Cohoon and Davidson", 1, true));
    }

    /*
     * Searches for books by keyword and allows the user to add a selected book to the cart, either as an ebook or physical copy.
     * Updates the cart and book availability based on user selection, with appropriate messages for invalid options or unavailable copies.
     */
    private void addBookToCart(Scanner scanner) {
    	System.out.println();
    	System.out.print("Enter a keyword: ");
    	String keyword = scanner.nextLine().toLowerCase();
    	ArrayList<Book> foundBooks = new ArrayList<>();// List to store books that match the search keyword

    	for (Book book : books) {
    		if (book.getTitle().toLowerCase().contains(keyword)) {
    			foundBooks.add(book);    
    			if(foundBooks.size()==1) {	
    				System.out.println("The following book(s) are found:");
    			}              
    			System.out.println((foundBooks.size()) + ". " + book.getTitle() + " | " + book.getAuthor()+ " | "+book.getPhysicalCopies()+ " copies | "+(book.isEbookAvailable() ? "yes" : "no"));
    		}
    	}

    	if (foundBooks.isEmpty()) {
    		System.out.println("Sorry! There are no books that match with your keyword.");
    		System.out.println();
    		return;
    	}

    	System.out.println((foundBooks.size() + 1) + ". Cancel");
    	System.out.print("Please select: ");
    	int userChoice = scanner.nextInt();// Variable to hold the user's choice of book from the list of found books
    	scanner.nextLine();

    	if (userChoice < 1 || userChoice > foundBooks.size()) {
    		return;
    	}

    	Book selectedBook = foundBooks.get(userChoice - 1);
    	System.out.print("Do you want to buy this as an ebook? ");
    	String ebookChoice = scanner.nextLine(); // user input to choose ebook or physical copy
    	if (ebookChoice.equalsIgnoreCase("yes") && selectedBook.isEbookAvailable()) {
    		cart.add(selectedBook); // adds selected ebook is added to cart
    		selectedBook.purchase(); // Marks the book as purchased as an eboo
    		System.out.println(selectedBook.getTitle() + " (ebook) has been added to your cart.");
    		System.out.println();
    	}else if(ebookChoice.equalsIgnoreCase("no") && selectedBook.getPhysicalCopies()>0) {
    		System.out.println("\""+selectedBook.getTitle() + "\" has been added to your cart.");
    		cart.add(selectedBook); //adds selected physical book is added to cart
    		selectedBook.decreasePhysicalCopies(); // Reduces the number of physical copies of the book
    		System.out.println(); 	
    	}else {
    		System.out.println("Sorry! There are no physical copies of the book!");
    		System.out.println();
    	}
    }

    /*
     * Displays the contents of the shopping cart, listing all books currently in the cart.
     */
    private void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            System.out.println();
        } else {
            System.out.println("Your shopping cart contains the following book(s): ");
            for (int i = 0; i < cart.size(); i++) {
                Book book = cart.get(i);
                System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
                System.out.println();
            }
            
        }
    }

    /*
     * Removes a selected book from the shopping cart based on user input.
     * First displays the cart contents, then based on userInput removes the book from cart
     */
    private void removeBookFromCart(Scanner scanner) {
        viewCartToRemoveBook();
        if (!cart.isEmpty()) {
            System.out.print("What do you want to remove: ");
            int selection = scanner.nextInt(); // userInput to select which book to remove from cart
            scanner.nextLine();
            if (selection > 0 && selection <= cart.size()) {
                cart.remove(selection - 1);// removing selected book from cart
                System.out.println("Item removed from shopping cart");
                System.out.println();
            }
        }
    }
    
    /*
     * Each book in the cart is listed with an index, and an extra option to cancel the removal process is added at the end.
     */
    private void viewCartToRemoveBook() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            System.out.println();
        } else {
            System.out.println("Your shopping cart contains the following book(s): ");
            for (int i = 0; i < cart.size(); i++) {
                Book book = cart.get(i);
                System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
                System.out.println((i+2)+". Cancel");
            }
            
        }
    }

    /*
     * If the cart is not empty, calculating and displaying the total cost based on whether the items are ebooks or physical copies.
     * after that clears the cart.
     */
    private void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double total = 0.0; // variable to add ebook and physical copy prices
            for (Book book : cart) {
                if (book.isPurchased()) {
                    total += 8.0; // Cost for ebooks
                } else {
                    total += 50.0; // Cost for physical books
                }
            }
            System.out.println("You have purchased items to the total value of $" + String.format("%.2f", total)+".");
            System.out.println("Thanks for shopping with The Reading Room!");
            System.out.println();
            cart.clear();// clearing cart after checkout
        }
    }

    /*
     * Lists all available books in the store, showing each book's title, author, number of physical copies, and availability of the ebook.
     */
    private void listAllBooks() {
        System.out.println("The following books are available:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPhysicalCopies() + " copies | " +
                    (book.isEbookAvailable() ? "yes" : "no"));
        }
        System.out.println();
        System.out.println();
    }
}
