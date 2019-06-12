package deta;

public class Test08 {
    public static void main(String[] args) {
        char[] arr = {'i','t','c','a','s','a'};
        System.arraycopy(arr,1,arr,5,1);
        System.out.println(arr);
    }
}
