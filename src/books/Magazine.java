package books;

import java.sql.Date;

public class Magazine extends Book{
    private String genre;
    private String issueMonth;

    public Magazine(int bookId, String author, String name, double price, int rackNo,
                   boolean status, String edition, Date dateOfPurchase, String genre, String issueMonth) {
        super(bookId, author, name, price, rackNo, status, edition, dateOfPurchase);
        this.genre = genre;
        this.issueMonth = issueMonth;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }
}
