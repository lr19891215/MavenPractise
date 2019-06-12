package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] col = {"♥","♠","♣","♢"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < col.length; j++) {
                poker.add(col[j] + num[i]);
            }
        }
        Collections.shuffle(poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if(i > poker.size() - 4 ){
                dipai.add(poker.get(i));
            }else if(i % 3 == 0){
                player1.add(poker.get(i));
            }else if(i % 3 == 1) {
                player2.add(poker.get(i));
            }else if(i % 3 == 2) {
                player3.add(poker.get(i));
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);
        System.out.println("玩家1:" + player1);
        System.out.println("玩家2:" + player2);
        System.out.println("玩家3:" + player3);
        System.out.println("底牌:" + dipai);
    }
}
