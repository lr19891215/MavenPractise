package cn.itcast.domain;

public class Customer {

    private String name;
    private String birthday;
    private String male;
    private Integer eng;
    private Integer math;
    private String town;
    private String addr;
    private String email;
    private String phone;



    @Override
    public String toString() {

        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", male='" + male + '\'' +
                ", eng=" + eng +
                ", math=" + math +
                ", town='" + town + '\'' +
                ", addr='" + addr + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }



    public String getName() {

        return name;
    }



    public void setName(String name) {

        this.name = name;
    }



    public String getBirthday() {

        return birthday;
    }



    public void setBirthday(String birthday) {

        this.birthday = birthday;
    }



    public String getMale() {

        return male;
    }



    public void setMale(String male) {

        this.male = male;
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



    public String getTown() {

        return town;
    }



    public void setTown(String town) {

        this.town = town;
    }



    public String getAddr() {

        return addr;
    }



    public void setAddr(String addr) {

        this.addr = addr;
    }



    public String getEmail() {

        return email;
    }



    public void setEmail(String email) {

        this.email = email;
    }



    public String getPhone() {

        return phone;
    }



    public void setPhone(String phone) {

        this.phone = phone;
    }
}
