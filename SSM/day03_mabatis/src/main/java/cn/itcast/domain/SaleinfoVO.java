package cn.itcast.domain;

import java.util.Date;

public class SaleinfoVO {
    private Double prices;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }
}
