package page_03.stage_9.java;

import java.util.Arrays;
import java.util.HashSet;

public class Sample_95 {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        set.add("Jump");
//        set.add("To");
//        set.add("Java");
//        System.out.println(set); // [Java, To, Jump] 출력

        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To","Java"));
        System.out.println(set); // [Java, To, Jump] 출력
    }
}
