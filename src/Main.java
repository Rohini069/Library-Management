import bills.Transaction;
import books.Book;
import person.Librarian;
import person.Student;

import java.sql.Date;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date dom = Date.valueOf(LocalDate.of(2024,4,1));
        Librarian librarian = new Librarian("rohini","123");
        Book book1 = new Book(1,"John","Adventures",50,5,true,
                "1st Edition", Date.valueOf(LocalDate.of(2024,3,1)));
        Book book2 = new Book(2,"Jane","Adventures2",50,4,true,
                "2nd Edition", Date.valueOf(LocalDate.of(2024,2,1)));
        librarian.addBook(book1);
        librarian.addBook(book2);

        Student student = new Student(1,dom,0,5,"Manish","Abc city",
                123456,"1","B.E");

        librarian.issueBook(student,book1);
        System.out.println("Student transaction:" +"Tn id:"+Transaction.retrieveTransaction("txn1").getTxnId()+", " +"MemId:"+Transaction.retrieveTransaction("txn1").getMemId()
                +", "+"BookId:"+Transaction.retrieveTransaction("txn1").getBookId());
        System.out.println(student.getName());


    }
}