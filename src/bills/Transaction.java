package bills;

import books.Book;
import library.Library;
import person.Member;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private static String txnId;
    private static int memId;
    private static int bookId;
    private static Date dateOfIssue;
    private static Date dueDate;
    private static List<Transaction> transactions = new ArrayList<>();
    private static boolean isReturned = false;


    public Transaction(String txnId, int memId, int bookId, Date dateOfIssue, Date dueDate) {
        this.txnId = txnId;
        this.memId = memId;
        this.bookId = bookId;
        this.dateOfIssue = dateOfIssue;
        this.dueDate = dueDate;
    }


    public static void createTransaction(String txnId, int memId, int bookId, Date dateOfIssue, Date dueDate){
        Transaction transaction = new Transaction( txnId,  memId,  bookId,  dateOfIssue,  dueDate);
        transactions.add(transaction);
    }

    public static void deleteTransaction(String txnId){
        for(Transaction txn : transactions){
            if(txn.getTxnId().equals(txnId)){
                transactions.remove(txn);
                break;
            }
        }
    }

    public static Transaction retrieveTransaction(String txnId){
        for(Transaction txn : transactions){
            if(txn.getTxnId().equals(txnId)){
                return txn;
            }
        }
        return null;
    }

    public static Transaction retrieveTransaction(int memId, int bookId){
        for(Transaction txn : transactions){
            if(txn.getMemId() == memId && txn.getBookId() == bookId){
                return txn;
            }
        }
        return null;
    }


    public String toString() {
        return "Transaction : txnId=" + txnId + ", memId=" + memId + ", bookId=" + bookId +
                ", dateOfIssue=" + dateOfIssue + ", dueDate=" + dueDate + ", isReturned=" + isReturned + "]";
    }


    public static List<Transaction> getTransactions() {
        return transactions;
    }

    public static boolean isIsReturned() {
        return isReturned;
    }

    public static void setIsReturned(boolean isReturned) {
        Transaction.isReturned = isReturned;
    }

    public static void setTransactions(List<Transaction> transactions) {
        Transaction.transactions = transactions;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
