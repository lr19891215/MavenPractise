package test.test05;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("关云长");
        list.add("张翼德");
        list.add("赵子龙");
        list.add("马孟起");
        list.add("黄汉升");
        System.out.println(list);
        print(list);
    }

    public static void print(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i) + "}");
            }else{
                System.out.print(list.get(i) + "@");
            }
        }
    }

}
