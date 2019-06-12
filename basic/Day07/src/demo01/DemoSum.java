package demo01;

import java.util.ArrayList;

public class DemoSum {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘邦");
        list.add("项羽");
        list.add("胡亥");
        String remove = list.remove(2);
        System.out.println("被删除的是:" + remove);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
