package page_03.stage_7.java;

import java.util.ArrayList;

public class Sample_79 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.remove("129")); // true

//        (... 생략 ...)
        System.out.println(pitches.remove(0)); // 138
    }
}
