package cn.itcast.domain;

public class Province {
    private int id;
    private String p_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                '}';
    }
}
