package cn.itcast.domain;

public class Book {
    private String bname;
    private Integer price;

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
