package test.kuozhan.test03;

public class Test03 {
     static int i = 10;
    public static void main(String[] args) {
        System.out.println(num(1));
    }

    public static int num(int n) {
        if(i == 1){
            return n;
        }
        i --;
       return  (num(n) + 1)*2;

    }
}
