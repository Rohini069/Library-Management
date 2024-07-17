package books;

import java.sql.Date;

public class StudyBooks extends Book{
    private String subject;
    private String yearOfStudy;


    public StudyBooks(int bookId, String author, String name, double price, int rackNo,
                      boolean status, String edition, Date dateOfPurchase, String subject, String yearOfStudy) {
        super(bookId, author, name, price, rackNo, status, edition, dateOfPurchase);
        this.subject = subject;
        this.yearOfStudy = yearOfStudy;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
