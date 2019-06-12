package hashmapdemo;

import java.util.Objects;

public class Person {
    private String name;
    private String menpai;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(menpai, person.menpai);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, menpai);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", menpai='" + menpai + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, String menpai) {
        this.name = name;
        this.menpai = menpai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenpai() {
        return menpai;
    }

    public void setMenpai(String menpai) {
        this.menpai = menpai;
    }
}
