package page_04.stage_1.java;

import java.util.ArrayList;

public class Sample_117 {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어 가라");
        }

    }
}
