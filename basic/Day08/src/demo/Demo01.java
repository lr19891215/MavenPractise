package demo;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(to(arr));
    }

    public static String to(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str += "word" + array[i];
            }else{
                str += "word" + array[i] + "#";
            }
        }
        str += "]";
        return str;
    }
}
