package cn.itcast.domain;

import java.util.Date;
import java.util.List;

public class Customer {
    private Integer id;
    private String name;
    private Date birthday;
    private Integer eng;
    private Integer math;
    private String addr;
    private String town;
    private String email;
    private String male;
    private String phone;

    private List<Saleinfo> saleinfos;

    public List<Saleinfo> getSaleinfos() {
        return saleinfos;
    }

    public void setSaleinfos(List<Saleinfo> saleinfos) {
        this.saleinfos = saleinfos;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", eng=" + eng +
                ", math=" + math +
                ", addr='" + addr + '\'' +
                ", town='" + town + '\'' +
                ", email='" + email + '\'' +
                ", male='" + male + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getEng() {
        return eng;
    }

    public void setEng(Integer eng) {
        this.eng = eng;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
