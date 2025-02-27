package practise.LibraryManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;
import java.util.Date;

class MainDriver{
	

    public static void main(String[] args) {
    	
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        LoanService loanService = new LoanService();

        // Add some books
        Book book1 = new Book();
        book1.setIsbn("978-0134685991");
        book1.setTitle("Effective Java");
        book1.setAuthor("Joshua Bloch");
        book1.setTotalCopies(5);
        book1.setAvailableCopies(1);
        bookService.addBook(book1);
        
        Book book2 = new Book();
        book2.setIsbn("978-0134685991");
        book2.setTitle("Effective Python");
        book2.setAuthor("writer");
        book2.setTotalCopies(5);
        book2.setAvailableCopies(1);
        bookService.addBook(book2);

        // Add a member
        Member member1 = new Member();
        member1.setMemberId("M001");
        member1.setName("Alice Smith");
        member1.setEmail("alice.smith@example.com");
        memberService.addMember(member1);
        
        
        Member member2 = new Member();
        member2.setMemberId("M002");
        member2.setName("Bheem");
        member2.setEmail("sathyabheem977@gmail.com");
        memberService.addMember(member2);

        // Create a loan
        Loan loan1 = loanService.createLoan(member1, book1);
        Loan loan2 = loanService.createLoan(member2, book2);
        if (loan1 != null) {
            System.out.println("Loan1 created successfully: " + loan1.getLoanId());
        } else {
            System.out.println("Failed to create loan.");
        }
        
        if (loan2 != null) {
            System.out.println("Loan2 created successfully: " + loan2.getLoanId());
        } else {
            System.out.println("Failed to create loan.");
        }

        // List all books
        System.out.println("Available books:");
        for (Book book : bookService.getAllBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // List all members
        System.out.println("Library members:");
        for (Member member : memberService.getAllMembers()) {
            System.out.println(member.getName());
        }

        // List all loans
        System.out.println("All loans:");
        for (Loan loanEntry : loanService.getAllLoans()) {
            System.out.println(loanEntry.getLoanId() + " for member " + loanEntry.getMember().getName());
        }

        // Return a book
        loanService.returnLoan(loan1);
        System.out.println("Book returned successfully.");
    }
}    
