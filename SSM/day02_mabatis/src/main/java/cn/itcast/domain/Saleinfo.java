package cn.itcast.domain;

import java.util.Date;

public class Saleinfo extends SaleinfoVO{
    private Integer sid;
    private Integer cid;
    private Integer bid;
    private Integer nums;
    private Date sdate;

    private Book book;
    private Customer customer;

    public Book getBook() {
        return book;
    }



    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Saleinfo{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", bid=" + bid +
                ", nums=" + nums +
                ", sdate='" + sdate + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
}
