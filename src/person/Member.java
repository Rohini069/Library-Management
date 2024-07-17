package person;

import java.sql.Date;

public class Member {
    private int memId;
    private Date dateOfMembership;
    private int booksIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private long phNo;

    public Member(int memId, Date dateOfMembership, int booksIssued,
                  int maxBookLimit, String name, String address, long phNo) {
        this.memId = memId;
        this.dateOfMembership = dateOfMembership;
        this.booksIssued = booksIssued;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
    }

    public void retrieveMember(){
        System.out.println("Member : " +
                "memId=" + memId +
                ", dateOfMembership=" + dateOfMembership +
                ", booksIssued=" + booksIssued +
                ", maxBookLimit=" + maxBookLimit +
                ", name='" + name  +
                ", address='" + address  +
                ", phNo=" + phNo
        );
    }

    public int increaseBooksIssued(int count){
        if((booksIssued + count) > maxBookLimit){
            return 0;
        }
        booksIssued+=count;
        return 1;
    }

    public int decreaseBookIssued(int count){
        if(booksIssued == 0)
            return 0;
        booksIssued -= count;
        return 1;
    }


    public boolean isEligibleForIssuing(int count){
        return (booksIssued + count) <= maxBookLimit;
    }


    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }
}
