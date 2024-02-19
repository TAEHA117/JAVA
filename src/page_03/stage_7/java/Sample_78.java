package page_03.stage_7.java;

import java.util.ArrayList;

public class Sample_78 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1)); // 129 - 0~2 중 인덱스1의 값을 추출한 것

        // (... 생략 ...)
        System.out.println(pitches.size()); // 3


        // (... 생략 ...)
        System.out.println(pitches.contains("142")); // true


    }
}
