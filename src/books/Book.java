package books;
import java.sql.Date;

public class Book {
    private int BookId;
    private String author;
    private String name;
    private double price;
    private int rackNo;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;

    public Book(int bookId, String author, String name, double price,
                int rackNo, boolean status, String edition, Date dateOfPurchase) {
        BookId = bookId;
        this.author = author;
        this.name = name;
        this.price = price;
        this.rackNo = rackNo;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    private void displayBookDetails(){
        System.out.println("Book Details :" +
                "BookId='" + BookId  +
                ", author='" + author  +
                ", name='" + name  +
                ", price=" + price +
                ", rackNo=" + rackNo +
                ", status=" + status +
                ", edition='" + edition  +
                ", dateOfPurchase=" + dateOfPurchase
                );
    }

    public boolean updateStatus(){
        status = !status;
        return status;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRackNo() {
        return rackNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
