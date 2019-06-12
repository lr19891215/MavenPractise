package demo;

import java.io.Reader;

public class DemoIntImpl{
    public static void main(String[] args) {
        DemoInt demoInt = new DemoInt() {
            @Override
            public void sout() {
                System.out.println("As");
            }
        };

        DemoInt d = () -> System.out.println("123");
        demoInt.sout();


    }

    public static DemoInt moth() {
                return ()-> System.out.println("22222");
            }
        };

