package page_03.stage_9.java;

import java.util.Arrays;
import java.util.HashSet;

public class Sample_94 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract생성
        substract.removeAll(s2);
        System.out.println(substract); // [1,2,3] 출력
    }
}
