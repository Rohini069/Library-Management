package bills;

import java.sql.Date;

public class CreateBill {
    private String billNo;
    private Date date;
    private int memId;
    private double amount;


    public static void createBill(String billNo, Date date, int memberId, double amount){
        System.out.println("Bill created with Bill No:"+ billNo + ", MemberId: "+memberId+", Date:"+date+", Amount"+amount);
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
