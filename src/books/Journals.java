package books;

import java.sql.Date;

public class Journals extends Book{
        private String journalName;
        private int volume;

    public Journals(int bookId, String author, String name, double price, int rackNo,
                    boolean status, String edition, Date dateOfPurchase, String journalName, int volume) {
        super(bookId, author, name, price, rackNo, status, edition, dateOfPurchase);
        this.journalName = journalName;
        this.volume = volume;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
