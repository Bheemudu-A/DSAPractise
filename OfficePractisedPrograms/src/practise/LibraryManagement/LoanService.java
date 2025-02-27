package practise.LibraryManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;
import java.lang.Integer;
import java.util.Date;

class LoanService{

	private List<Loan> loans;

    public LoanService() {
        this.loans = new ArrayList<>();
    }

    public Loan createLoan(Member member, Book book) {
        if (book.getAvailableCopies() > 0) {
            Loan loan = new Loan();
            loan.setLoanId(UUID.randomUUID().toString());
            loan.setBook(book);
            loan.setMember(member);
            loan.setIssueDate(new Date());
            loan.setDueDate(new Date(System.currentTimeMillis())); // 1 week loan period
            book.setAvailableCopies(book.getAvailableCopies() - 1);
            loans.add(loan);
            System.out.println("loan: "+loan);
            return loan;
        }
        return null;
    }

    public List<Loan> getAllLoans() {
        return loans;
    }

    public Loan getLoanById(String loanId) {
        for (Loan loan : loans) {
            if (loan.getLoanId().equals(loanId)) {
                return loan;
            }
        }
        return null;
    }

    public void returnLoan(Loan loan) {
        loan.getBook().setAvailableCopies(loan.getBook().getAvailableCopies() + 1);
        loans.remove(loan);
    }
}
