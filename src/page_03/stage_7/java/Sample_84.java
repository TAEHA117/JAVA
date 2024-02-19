package page_03.stage_7.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample_84 {
    public static void main(String[] args) {
//        String[] pitches = new String[]{"138","129","142"};
//        String result = String.join(",",pitches);
//        System.out.println(result); // "138,129,142" 출력

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
        pitches.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
        System.out.println(pitches); // [138,129,142] 출력
    }
}
