package cn.itcast.domain;

import java.util.List;

public class Kind {
    private Integer kid;
    private String kname;

    private List<Book> books;

    @Override
    public String toString() {
        return "Kind{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }
}
