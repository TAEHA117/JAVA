package page_03.stage_7.java;

import java.util.ArrayList;

public class Sample_81 {
    public static void main(String[] args) {
/*        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");

        String one = pitches.get(0); // 형 변환이 필요없음.
        String two = pitches.get(1); // 형 변환이 필요없음.*/

        ArrayList<String> pitches = new ArrayList<>(); // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches); // [138, 129, 142] 출력


    }
}
