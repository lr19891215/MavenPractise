package cn.itcast.domain;

import java.util.Date;
import java.util.List;

public class SaleinfoVO {
    private Double prices;
    private Date date;

    public List<Saleinfo> saleinfos;

    public List<Saleinfo> getSaleinfos() {
        return saleinfos;
    }

    public void setSaleinfos(List<Saleinfo> saleinfos) {
        this.saleinfos = saleinfos;
    }

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
