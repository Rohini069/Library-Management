package library;

import bills.Transaction;
import books.Book;
import person.Librarian;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static ArrayList<Book> books;
    private Librarian librarian;
    private static Library library;

    private Library(){
        books = new ArrayList<>();
        librarian = new Librarian("Rohini","@123");
    }

    public static Library getInstance(){
        if(library == null){
            library = new Library();
        }
        return library;
    }


    public static ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public static Library getLibrary() {
        return library;
    }

    public static void setLibrary(Library library) {
        Library.library = library;
    }


}
