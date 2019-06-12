package test.test02;
//猜数字小游戏
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Random r = new Random();
        int result = r.nextInt(500) + 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("请输入你猜的数字(1-500):");
            int num = sc.nextInt();
            if(num >result) {
                System.out.println("值大了,请重猜");
            }else if(num<result) {
                System.out.println("值小了,请重猜");
            }else{
                System.out.println("恭喜你猜对了!");
                break;
            }
        }


    }
}
