package FirstJavaApp.src.JavaTestClass.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Records {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private HashMap<String, HashMap<String, String>> borrowedDays;

    public Records() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        borrowedDays = new HashMap<>();
    }

    public void readRecords(String recordFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(recordFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2);
                String bookId = parts[0].trim();
                Book book = new Book(bookId);
                if (!books.contains(book)) {
                    books.add(book);
                }
                HashMap<String, String> memberDays = new HashMap<>();
                String[] memberParts = parts[1].split(",");
                for (String memberPart : memberParts) {
                    String[] memberData = memberPart.trim().split(":");
                    String memberId = memberData[0].trim();
                    String days = memberData[1].trim();
                    Member member = new Member(memberId);
                    if (!members.contains(member)) {
                        members.add(member);
                    }
                    memberDays.put(memberId, days);
                }
                borrowedDays.put(bookId, memberDays);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayRecords() {
        System.out.print("BookID ");
        for (Member member : members) {
            System.out.print(String.format("%-6s", member.getMemberId()));
        }
        System.out.println();
        for (Book book : books) {
            System.out.print(book.getBookId() + " ");
            HashMap<String, String> memberDays = borrowedDays.get(book.getBookId());
            for (Member member : members) {
                String days = memberDays.get(member.getMemberId());
                if (days == null) {
                    System.out.print(String.format("%6s", "xx"));
                } else if (days.equals("R")) {
                    System.out.print(String.format("%6s", "--"));
                } else {
                    System.out.print(String.format("%6s", days));
                }
            }
            System.out.println();
        }
        int totalBooks = books.size();
        int totalMembers = members.size();
        double totalDays = 0;
        int countDays = 0;
        for (HashMap<String, String> memberDays : borrowedDays.values()) {
            for (String days : memberDays.values()) {
                if (!days.equals("R")) {
                    totalDays += Integer.parseInt(days);
                    countDays++;
                }
            }
        }
        double averageDays = countDays == 0 ? 0 : totalDays / countDays;
        System.out.println("Total number of books: " + totalBooks);
        System.out.println("Total number of members: " + totalMembers);
        System.out.println("Average number of days books have been borrowed: " + averageDays);
    }
}
