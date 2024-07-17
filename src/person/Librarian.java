package person;

import bills.CreateBill;
import bills.Transaction;
import books.Book;
import library.Library;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Book searchBook(int bookId){
        for (Book book : Library.getLibrary().getBooks()){
            if(book.getBookId() == bookId){
                return book;
            }
        }
        return null;
    }

    public void issueBook(Member member, Book book){
        if(member.isEligibleForIssuing(1)){
            member.increaseBooksIssued(1);
            book.updateStatus();
            Transaction.createTransaction("txn1",member.getMemId(),book.getBookId(),
                    Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now().plusDays(7)));
        }

    }

    public void createBill(String billNo, Date date, int memberId, double amount){
        CreateBill.createBill(billNo,date,memberId,amount);
    }

    public double calculateFine(Date dueDate){
        long overDueDays = ChronoUnit.DAYS.between(dueDate.toLocalDate(),LocalDate.now());
        if(overDueDays>0){
            double perDayFine = 1.0;
                return overDueDays*perDayFine;
        }
        return 0;
    }

    public  void returnBook(Member member, Book book) {
        Transaction transaction = Transaction.retrieveTransaction(member.getMemId(), book.getBookId());
        if (transaction != null) {
            Date dueDate = transaction.getDueDate();
            double fine = calculateFine(dueDate);

            if (fine > 0) {
                createBill("bill" + System.currentTimeMillis(), Date.valueOf(LocalDate.now()), member.getMemId(), fine);
                System.out.println("Fine of " + fine + " has been charged to member " + member.getMemId());
            }


            book.updateStatus();

            member.decreaseBookIssued(1);

            Transaction.setIsReturned(true);
        } else {
                System.out.println("Transaction not found for member " + member.getMemId() +
                        " and book " + book.getBookId());
        }
    }

    public void addBook(Book book){ Library.getInstance().getBooks().add(book);}

    public void addBooks(List<Book> books){
        Library.getInstance().getBooks().addAll(books);
    }

    public int removeBook(int bookId){
        for(Book book : Library.getInstance().getBooks()){
            if(bookId == book.getBookId()){
                Library.getInstance().getBooks().remove(book);
                return 1;
            }
        }
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
