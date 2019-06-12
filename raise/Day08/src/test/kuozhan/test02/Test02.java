package test.kuozhan.test02;

public class Test02 {
    static int month = 1;
    public static void main(String[] args) {
        System.out.println(tuZi(24));
    }

    public static int tuZi(int month) {
        if(month == 1 || month == 2){
            return 1;
        }
        return tuZi(month-2) + tuZi(month-1);
    }
}
