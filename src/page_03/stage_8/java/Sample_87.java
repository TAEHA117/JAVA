package page_03.stage_8.java;

import java.util.HashMap;

public class Sample_87 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people","사람");
        map.put("baseball","야구");
        System.out.println(map.get("people")); // "사람" 출력
    }
}
