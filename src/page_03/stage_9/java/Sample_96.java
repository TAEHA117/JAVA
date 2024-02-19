package page_03.stage_9.java;

import java.util.Arrays;
import java.util.HashSet;

public class Sample_96 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump","To","Java"));
        set.remove("To");
        System.out.println(set); // [Java, Jump] 출력 - To 제거
    }
}
