package test.test03;

public class NewPhone extends Phone implements IPlay {


    @Override
    public void play() {
        System.out.println("玩游戏");
    }
}
