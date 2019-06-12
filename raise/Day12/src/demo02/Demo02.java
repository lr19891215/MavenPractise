package demo02;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo02 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->{
            int[] arr = {9,5,8,4,56,8,5,1,6};
            Arrays.sort(arr);
            int max = arr[arr.length-1];
            return max;
        };

        Integer max = supplier.get();
        System.out.println(max);
    }
}
