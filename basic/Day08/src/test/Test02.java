package test;

public class Test02 {
    public static void main(String[] args) {
        String str = "YVTFugj12&@$&ih";
        int up = 0;
        int low = 0;
        int num = 0;
        int other = 0;
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                up++;
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                low++;
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                num++;
            }else{
                other++;
            }
        }
        System.out.println("大写字母的个数是:" + up);
        System.out.println("小写字母的个数是:" + low);
        System.out.println("数字的个数是:" + num);
        System.out.println("其他字符的个数是:" + other);
    }
}
