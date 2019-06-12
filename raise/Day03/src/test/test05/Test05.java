package test.test05;
import java.util.LinkedList;

public class Test05 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.addFirst(6);
        list.addLast(6);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        System.out.println(list);

        }
    }
