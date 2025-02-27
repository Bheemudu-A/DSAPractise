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

class Loan{
	
	private String loanId;
    private Book book;
    private Member member;
    private Date issueDate;
    private Date dueDate;
    
	public String getLoanId() {
		return loanId;
	}


	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	public Date getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", book=" + book + ", member=" + member + ", issueDate=" + issueDate
				+ ", dueDate=" + dueDate + "]";
	}
    
	
    
}
