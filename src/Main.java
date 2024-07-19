import bills.Transaction;
import books.Book;
import library.Library;
import person.Librarian;
import person.Student;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date dom = Date.valueOf(LocalDate.of(2024,4,1));
        Librarian librarian = new Librarian("rohini","123");
        Book book1 = new Book(8,"John","Adventures",50,5,true,
                "1st Edition", Date.valueOf(LocalDate.of(2024,3,1)));
        Book book2 = new Book(2,"Jane","Avengers",50,4,true,
                "2nd Edition", Date.valueOf(LocalDate.of(2024,2,1)));
        Book book3 = new Book(15,"John","Run for life",50,5,true,
                "1st Edition", Date.valueOf(LocalDate.of(2024,3,1)));
        Book book4 = new Book(1,"Jane","Stories",50,4,true,
                "2nd Edition", Date.valueOf(LocalDate.of(2024,2,1)));
//        librarian.addBook(book1);
//        librarian.addBook(book2);
//
//        Student student = new Student(1,dom,0,5,"Manish","Abc city",
//                123456,"1","B.E");
//
//        librarian.issueBook(student,book1);
//        System.out.println("Student transaction:" +"Tn id:"+Transaction.retrieveTransaction("txn1").getTxnId()+", " +"MemId:"+Transaction.retrieveTransaction("txn1").getMemId()
//                +", "+"BookId:"+Transaction.retrieveTransaction("txn1").getBookId());
//        System.out.println(student.getName());
        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        Library.getInstance().setBooks(booksList);
        Collections.sort(Library.getBooks());
        for(Book book :Library.getBooks()){
            System.out.println("BookId:"+book.getBookId()+" ,Author:"+book.getAuthor());
        }


    }
}